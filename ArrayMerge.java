public class ArrayMerge{
	public static int[] mergeArray(int[] first, int[] second){
		int a;
		int b;
		a=first.length;
		b=second.length;
		int[] result = new int[a+b];
		for(int i=0; i<a;i++){
			result[i]=first[i];
		}
		for(int i=0;i<b;i++){
			result[a+i]=second[i];
		}
		return result;
	}

	public static void printArray(int[] array){
		System.out.println(java.util.Arrays.toString(array));
	}

	public static void main(String[] args){

	int[] firstArray;
	firstArray = new int[]{1,2,3};
	int[] secondArray;
	secondArray = new int[]{4,5,6,7};

	printArray(firstArray);
	printArray(secondArray);
	printArray(mergeArray(firstArray, secondArray));

	firstArray = new int[]{1};
	secondArray = new int[]{};

	printArray(firstArray);
	printArray(secondArray);
	printArray(mergeArray(firstArray, secondArray));

	firstArray = new int[]{};
	secondArray = new int[]{4};

	printArray(firstArray);
	printArray(secondArray);
	printArray(mergeArray(firstArray, secondArray));
	}
}