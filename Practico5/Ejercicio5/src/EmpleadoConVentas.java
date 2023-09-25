
    public class EmpleadoConVentas extends Empleado {
        private double porcentajeVentas;
    
        public EmpleadoConVentas(String nombre, String apellido, String dni, double sueldoMensual, double porcentajeVentas) {
            super(nombre, apellido, dni, sueldoMensual);
            this.porcentajeVentas = porcentajeVentas;
        }
    
        @Override
        public double calcularSueldoTotal() {
            // Calcula el sueldo total teniendo en cuenta el sueldo base y el extra por ventas
            double sueldoBase = super.calcularSueldoTotal();
            double extraVentas = sueldoBase * (porcentajeVentas / 100.0);
            return sueldoBase + extraVentas;
        }

        public double getPorcentajeVentas() {
            return porcentajeVentas;
        }

        public void setPorcentajeVentas(double porcentajeVentas) {
            this.porcentajeVentas = porcentajeVentas;
        }

        
}
