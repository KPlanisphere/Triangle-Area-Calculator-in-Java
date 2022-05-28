class TTriangulo{
	//****DEFINICION DE ATRIBUTOS****
	private double base, altura;

	//****DEFINICION DE LOS METODOS****
	//METODO CONTRUCTOR
	TTriangulo(){
		base = 0;
		altura = 0;
	}

	//METODOS GET
	public double getBase(){
		return base;
	}

	public double getAltura(){
		return altura;
	}

	//METODOS SET
	public void setBase(double base){
		this.base = base;
	}

	public void setAltura(double altura){
		this.altura = altura;
	}

	//METODO DIVERSO
	public double calcularArea(){
		return (base*altura)/2;
	}

}//FIN DEL PROGRAMA