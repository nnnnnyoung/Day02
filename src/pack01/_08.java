package pack01;

public class _08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=40;
		a++; /*a=a+1*/
		System.out.println(a); /*a=41*/
		System.out.println(a+1); /*���� a�� ���� ������ ���� ��¿��� +1 �� �� 42�� ���*/
		System.out.println(a); /*a=41*/
		System.out.println(++a); /*�����ڰ� ���� ������ ���� a�� ������ ��ȭ�� ���� 42�� ���*/
		System.out.println(a); /*a=42*/
		System.out.println(a++) ;
		/*�����ڰ� ���� ������ ���� a�� ������ ��ȭ�� ���� �׷����� a���� ����� ������++����*/
		/* 42�� ���*/
		System.out.println(a); /*a=43*/
			
		
		//���������ڿ� ���������� ���� ���
		//���� ������ ���ݾ��� �ٸ��ϴ�. 
		//�ڹٿ����� ;�� �ǹ��ϴ� �ٰ� ��ɹ��� ��
		//System.out.println(a++) �̰��� �ϳ��� ��ɹ� ���
		//���������ڴ� ��ɾ� ����� �����ϱ� ���� ������ �̷�����ϴ�.
		//���������ڴ� ��ɾ� ����� ���� ������ ������ �̷�����ϴ�.
		// System.out.println(a++) �� �ǹ��ϴ� �ٴ� a�� ����� �� a++�� �����Ѵ�
     	//System.out.println(++a); �� �ǹ��ϴ� �ٴ� ++a�� ����ϰ� ����
		
		
		int aa=40;
		int bb=30;
		int cc=20;
		int dd=2;
		int ee=4;
		
		System.out.println(++aa); 
		/* aa+1�� ��� ���� aa�����͵� ����
		 * ��� 41 */
		System.out.println(aa);
		/*aa=41*/
		System.out.println(++aa+bb++);
		/* (aa+1)+bb �� ��� �� bb���� +1�� 
		 * 72��� 
		 * aa=42 bb=31*/
		System.out.println(--cc+(-aa));
		/*cc-1+(-aa) ->(20-1)+(-42) =-23
		 * -23���� ���
		 * aa=42 cc=19*/
		System.out.println(cc+2);
		/* cc+2 ���� cc���� �������� �ʴ´� 
		 * ��� 21
		 * cc=19*/
		System.out.println(cc);
		/*cc=19*/
		System.out.println(--cc*(ee-dd)+dd++);
		/* (cc-1)*(ee-dd+dd) �� dd=dd+1 ���� 
		 * (19-1)*(4-2)+2
		 * ��� 38
		 * aa=42, bb=31, cc=18, dd=3
		 */
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		System.out.println(dd);
		
		
	}

}
