package mx.edu.ittepic.ladm_u2_practica1_luismartinez


class HiloAnimacion(p: MainActivity) : Thread() {
    var puntero = p

    override fun run() {
        super.run()
        sleep(4000)
        while (true) {
            sleep(100)
            puntero.runOnUiThread {
                puntero.lienzo!!.caerCopo()
            }
        }
    }
}