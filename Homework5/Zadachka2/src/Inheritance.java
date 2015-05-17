
public class Inheritance {

	public static void main(String[] args) {
		

		Car[] arr = new Car[10];
		arr[0] = new Automobile(2000, 3);
		arr[1] = new Automobile(7000, 4);
		arr[2] = new Automobile(11000, 5);
		arr[3] = new Automobile(17000, 6);
		arr[4] = new Automobile(5000, 7);
		arr[5] = new SUV(15000, true);
		arr[6] = new SUV(8000, false);
		arr[7] = new SUV(12000, true);
		arr[8] = new SUV(9000, false);
		arr[9] = new SUV(10000, false);
		
		for(int i = 0; i < 5; i++){
			arr[i].Say();
			arr[i].sayFuel();
		}
		
		for(int i = 5; i < 10; i++){
			arr[i].Say();
			arr[i].sayHigh();
		}
		
		for(int i = 0; i < 10; i++){
			for (int j = 0; j < arr.length - 1; j++)
            {
                if (arr[j].price > arr[j + 1].price) 
                {
                    int tmp = arr[j].price;
                    arr[j].price = arr[j + 1].price;
                    arr[j + 1].price = tmp;
                }
            }
		}

		for (int i = 0; i < arr.length; i++) 
        {
           System.out.print(arr[i].price + " ");
        }
	}

}
