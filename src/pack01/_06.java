package pack01;

public class _06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] partName= {"java","mysql","oracle","html","css"}; //���� �����ؼ� �迭�� ���� �� �ִ�.
		int [] point= new int[5]; //new�� �ϱ�, ���� int[]: int�� �����ϴ� �ڷ����� ����
		                          // point ������(���⼭�� �迭 ������)
		                          // �ڿ� int[5] �迭�� ũ��: 5���� int�� ������ �� �ִ� ����
								//  ����. �ε����� ��� �����ɱ�� A. 0~4���� ������ ����
						// 0���濡 JAVA����,1���濡 MYSQL ����~ �ǵ��� �迭�� �������.��� �����ڰ� ����
		
		point[0]=80; //point�迭�� 0�� �ε����� value�� ���� ���� 80�ڷḦ �����Ѵ�.
					//13���� �ڵ常 �м��ϸ� 80�� JAVA ������ ������ ���̴�. (X)
		point[1]=90; //point�迭�� 1�� �ε����� value�� ���� ���� 90�ڷḦ �����Ѵ�.
		point[2]=58;
		point[3]=49;
		point[4]=93;
		// 2�� INDEX�� �ִ� VALUE���� ����ϰڴ�
		System.out.println(point[0]);
		System.out.println(point[1]);
		System.out.println(point[2]);
		System.out.println(point[3]);
		System.out.println(point[4]);
		// ����Ʈ�� �������ִ� �ڷ����� �ϳ��� ��Ʈ�� �ϱ� ���� �迭�� �ٲ� ��! ���μ��� ���̱� ���ؼ��� �� ������Ѵ�.
		
		System.out.println(partName[0]+" "+point[0]); /*java 80*/
		System.out.println(partName[1]+" "+point[1]); /*mysql 90*/
		System.out.println(partName[2]+" "+point[2]); /*oracle 58*/
		System.out.println(partName[3]+" "+point[3]); /*html 49*/
		System.out.println(partName[4]+" "+point[4]); /*css 93*/
		
		String [] fruit = new String[4];
		fruit[0]="apple";
		fruit[3]="melon";
		System.out.println(fruit[0]);
		System.out.println(fruit[1]);
		System.out.println(fruit[2]);
		System.out.println(fruit[3]);

		
		
	}

}
