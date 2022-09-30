package com.gl4.tp01

fun main (argv  : Array<String>) {

    val rectangles  = arrayOf(Rectangle(),
        Rectangle(p = Point(5,-3),),
        Rectangle(q = Point(3,1)),
        Rectangle(Point(4,2),Point(2,8))
    )

    fun distance(p : Point , q : Point) : Int{
        return (Math.abs(p.x - q.x) + Math.abs(p.y - q.y)) ;
    }
    for(rectangle in rectangles){
        println("les Cordonnés sont : " + rectangle.toString())
        println("la surface est :" + rectangle.surface()  )
    }
}