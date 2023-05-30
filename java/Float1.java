class Float1
{
	public float addFloat(float number1, float number2){
		return number1 + number2;
	}
}
class Float2{
	public static void main(String[] args){
		Float1 float2 = new Float1();
		float ans = float2.addFloat(2.3f,4.3f);
		System.out.println(ans);
	}
}