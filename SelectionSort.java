public class SelectionSort{
	public static void sort(int[] xs){
		int temp;
		
		for(int i=0; i<xs.length; i++){
			int k=i;
			temp=xs[i];
			for(int j=i+1; j<xs.length; j++){
				if(temp>xs[j]){					
					xs[k]=xs[j];
					xs[j]=temp;
					k=j;
				}
				
			}
		}




	}
	public static void printArray(int[] array){
		System.out.println(java.util.Arrays.toString(array));
	}
	public static void main(String[] args){
		int[] array;
		array = new int[]{100,34,72,56,82,67,94};

		printArray(array);
		sort(array);
		printArray(array);

		array = new int[]{1,2,2,1,2,2,1,0};
		printArray(array);
		sort(array);
		printArray(array);

		array = new int[]{1};
		printArray(array);
		sort(array);
		printArray(array);	

		array = new int[]{};
		printArray(array);
		sort(array);
		printArray(array);
	}
}