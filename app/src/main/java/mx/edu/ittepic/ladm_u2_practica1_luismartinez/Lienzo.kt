package mx.edu.ittepic.ladm_u2_practica1_luismartinez

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View

class Lienzo(p: MainActivity) : View(p) {
    // se requiere p para que view sepa cual activity va a trabajar
    var puntero = p

    //luna
    var luna = FiguraGeometrica(100, 100, 50)
    var luna2 = FiguraGeometrica(110, 100, 50)

    //nubes
    var nubec1 = FiguraGeometrica(200, 100, 25)
    var nubec2 = FiguraGeometrica(230, 101, 25)
    var nubec3 = FiguraGeometrica(260, 100, 25)
    var nubec4 = FiguraGeometrica(210, 95, 25)
    var nubec5 = FiguraGeometrica(240, 95, 25)

    var nube2c1 = FiguraGeometrica(300, 200, 25)
    var nube2c2 = FiguraGeometrica(330, 201, 25)
    var nube2c3 = FiguraGeometrica(360, 200, 25)
    var nube2c4 = FiguraGeometrica(310, 195, 25)
    var nube2c5 = FiguraGeometrica(340, 195, 25)

    var nube3c1 = FiguraGeometrica(400, 50, 25)
    var nube3c2 = FiguraGeometrica(420, 55, 25)
    var nube3c3 = FiguraGeometrica(460, 50, 25)
    var nube3c4 = FiguraGeometrica(410, 45, 25)
    var nube3c5 = FiguraGeometrica(450, 47, 25)

    //Estrellas
    var star = FiguraGeometrica(55, 45, 2)
    var star1 = FiguraGeometrica(455, 85, 2)
    var star2 = FiguraGeometrica(200, 280, 2)

    var star3 = FiguraGeometrica(155, 135, 2)
    var star4 = FiguraGeometrica(305, 105, 2)
    var star5 = FiguraGeometrica(270, 315, 2)

    //casa1
    var casa = FiguraGeometrica(285, 500, 150, 175)
    var ven = FiguraGeometrica(295, 510, 30, 30)
    var ven1 = FiguraGeometrica(345, 510, 30, 30)
    var ven2 = FiguraGeometrica(395, 510, 30, 30)
    var ven3 = FiguraGeometrica(295, 560, 30, 30)
    var ven4 = FiguraGeometrica(345, 560, 30, 30)
    var ven5 = FiguraGeometrica(395, 560, 30, 30)
    var puerta = FiguraGeometrica(345, 620, 30, 50)
    //casa 2

    var casa2 = FiguraGeometrica(95, 500, 150, 175)
    var c2ven = FiguraGeometrica(105, 510, 30, 30)
    var c2ven1 = FiguraGeometrica(155, 510, 30, 30)
    var c2ven2 = FiguraGeometrica(205, 510, 30, 30)
    var c2ven3 = FiguraGeometrica(105, 560, 30, 30)
    var c2ven4 = FiguraGeometrica(155, 560, 30, 30)
    var c2ven5 = FiguraGeometrica(205, 560, 30, 30)
    var c2puerta = FiguraGeometrica(155, 620, 30, 50)

    //calle
    var calle = FiguraGeometrica(0, 700, 480, 200)
    var linea1 = FiguraGeometrica(15, 750, 100, 15)
    var linea2 = FiguraGeometrica(130, 750, 100, 15)
    var linea3 = FiguraGeometrica(245, 750, 100, 15)
    var linea4 = FiguraGeometrica(360, 750, 100, 15)

    //techo
    var techo = FiguraGeometrica(360f, 460f, 285f, 500f, 435f, 500f)
    var punteroFiguraGeometrica: FiguraGeometrica? = null

    //arbol
    var tronco = FiguraGeometrica(20, 600, 50, 80)
    var hojas = FiguraGeometrica(45f, 520f, 0f, 620f, 90f, 620f)
    var hojas1 = FiguraGeometrica(45f, 500f, 5f, 560f, 85f, 560f)


    //NIEVE

    var nieve: Array<FiguraGeometrica> =
        Array(100) { FiguraGeometrica((0..480).random(), (-500..0).random(), 4) }


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()
        canvas.drawColor(Color.rgb(1, 33, 50))
        //luna
        paint.color = Color.rgb(243, 243, 243)
        luna.pintar(canvas, paint)
        //luna menguante
        paint.color = Color.rgb(1, 33, 50)
        luna2.pintar(canvas, paint)

        //nubes
        paint.color = Color.rgb(196, 196, 196)
        nubec1.pintar(canvas, paint)
        nubec2.pintar(canvas, paint)
        nubec3.pintar(canvas, paint)
        nubec4.pintar(canvas, paint)
        nubec5.pintar(canvas, paint)

        nube2c1.pintar(canvas, paint)
        nube2c2.pintar(canvas, paint)
        nube2c3.pintar(canvas, paint)
        nube2c4.pintar(canvas, paint)
        nube2c5.pintar(canvas, paint)

        nube3c1.pintar(canvas, paint)
        nube3c2.pintar(canvas, paint)
        nube3c3.pintar(canvas, paint)
        nube3c4.pintar(canvas, paint)
        nube3c5.pintar(canvas, paint)

        //estrellas
        paint.color = Color.rgb(209, 240, 241)
        star.pintar(canvas, paint)
        star1.pintar(canvas, paint)
        star2.pintar(canvas, paint)
        paint.color = Color.rgb(248, 247, 186)
        star3.pintar(canvas, paint)
        star4.pintar(canvas, paint)
        star5.pintar(canvas, paint)
        //casas
        paint.color = Color.rgb(43, 49, 61)
        casa.pintar(canvas, paint)
        casa2.pintar(canvas, paint)
        //ventanas
        paint.color = Color.rgb(207, 222, 104)
        ven.pintar(canvas, paint)
        ven1.pintar(canvas, paint)
        ven2.pintar(canvas, paint)
        ven3.pintar(canvas, paint)
        ven4.pintar(canvas, paint)
        ven5.pintar(canvas, paint)
        ven.pintar(canvas, paint)

        c2ven.pintar(canvas, paint)
        c2ven1.pintar(canvas, paint)
        c2ven2.pintar(canvas, paint)
        c2ven3.pintar(canvas, paint)
        c2ven4.pintar(canvas, paint)
        c2ven5.pintar(canvas, paint)


        //techo
        paint.color = Color.rgb(233, 235, 239)
        techo.pintar(canvas, paint)


        //puerta
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(248, 196, 113)
        puerta.pintar(canvas, paint)
        c2puerta.pintar(canvas, paint)

        //calle
        paint.color = Color.rgb(138, 138, 132)
        calle.pintar(canvas, paint)
        paint.color = Color.rgb(235, 187, 8)
        linea1.pintar(canvas, paint)
        linea2.pintar(canvas, paint)
        linea3.pintar(canvas, paint)
        linea4.pintar(canvas, paint)

        //arbol
        paint.color = Color.rgb(153, 116, 62)
        tronco.pintar(canvas, paint)
        paint.color = Color.rgb(60, 140, 56)
        hojas.pintar(canvas, paint)
        hojas1.pintar(canvas, paint)


        //copos
        paint.color = Color.rgb(233, 235, 239)

        (nieve.indices).forEach() {
            nieve[it].pintar(canvas, paint)
        }

        //bordes
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        ven1.pintar(canvas, paint)
        ven2.pintar(canvas, paint)
        ven3.pintar(canvas, paint)
        ven4.pintar(canvas, paint)
        ven5.pintar(canvas, paint)
        ven.pintar(canvas, paint)
        c2ven.pintar(canvas, paint)
        c2ven1.pintar(canvas, paint)
        c2ven2.pintar(canvas, paint)
        c2ven3.pintar(canvas, paint)
        c2ven4.pintar(canvas, paint)
        c2ven5.pintar(canvas, paint)
        calle.pintar(canvas, paint)
        puerta.pintar(canvas, paint)
        c2puerta.pintar(canvas, paint)
    }

    fun caerCopo() {
        (nieve.indices).forEach() {
            nieve[it].caer(width, height)
        }

        invalidate()

    }
}