package scalabook

import Element.elem
/**
  * Created by Administrador on 27/11/2016.
  */
abstract class Element {

  def content: Array[String]

  def height: Int = content.length

  def width: Int = content(0).length


  def above(that: Element): Element = {
    val this1 = this widen that.width
    val that1 = that widen this.width
    elem(this1.content ++ that1.content)
  }

  def beside(that: Element): Element ={
    val this1 = this heighten that.height
    val that1 = that.heighten(this.height)
    elem(
      for(
        (line1, line2)<- this1.content zip that1.content
      )yield line1 + line2
    )
  }

  def widen(w: Int): Element=
    if(w <= width) this
    else{
      val left = elem(" ", (w-width)/2, height)
      val right = elem(" ", w - width - left.width, height)
      left beside this beside right
    }

  def heighten(h: Int): Element =
    if(h <= height) this
    else{
      val top = elem(" ", width, (h - height)/2)
      val bot = elem(" " ,width, h - height - top.height)
      top above this above bot
    }

  override def toString: String = content mkString "/n"
}

object Element{

  private class LineElement(s: String) extends Element{
    val content =  Array(s)

    override def width: Int = s.length

    override def height: Int = 1
  }

  private class UniforElement(
                               ch: String,
                               override val width: Int,
                               override val height: Int

                             )extends Element{
    private val line = ch.toString * width
    def content = Array.fill(height)(line)
  }

  def elem(contents: Array[String]): Element =
    new ArrayElement(contents)
  
  def elem(chr: String, widht: Int, height: Int): Element =
    new UniforElement(chr, widht, height)
  
  def elem(line: String): Element =
    new LineElement(line)
}

private class ArrayElement(
                          val content: Array[String]
                          )extends Element



