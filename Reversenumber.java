class ShowTest{
    final void showValues() {
        System.out.println("Inside superclass method.");
    }}
public class Main extends ShowTest
{  
    void showValues() {
        System.out.println("Inside subclass method.");
    }
	public static void main(String[] args) {
		Main main = new Main();
		main.showValues();
	}
}
