
    class AlarmaLuminosa extends Alarma {
        private Luz luz;
    
        public AlarmaLuminosa() {
            this.luz = new Luz();
        }
    
        @Override
        public void comprobar() {
            super.comprobar(); // Hacer sonar la alarma
            if (super.seRompioVidrio || super.seAbrioPuertaVentana || super.seDetectoMovimiento) {
                luz.encender(); // Encender la luz
            }
        }
    }

