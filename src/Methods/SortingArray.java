package Methods;

public class SortingArray {
		
	public static void sortArr(int[] arr1) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr1[i]<arr1[j]) {
					int temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
	}
	
	public static void print(int[] arr1) {
		for(int item:arr1) {
			System.out.print(item+"\t");
		}
	}

}
