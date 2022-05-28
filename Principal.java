class Principal{
	public static void main(String[] args){
		TTriangulo t1;
		
		t1 = new TTriangulo();
		
		t1.setBase(3);
		t1.setAltura(4);
		
		System.out.println("El area del triangulo es: " + t1.calcularArea());
	
	}//FIN MAIN
	
}//FIN PRINCIPAL
