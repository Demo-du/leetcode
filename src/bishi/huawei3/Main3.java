package huawei3;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
        	String s1=sc.nextLine().trim();
        	String s2=sc.nextLine().trim();
        	System.out.println(multiply(s1,s2));
        }
	}
	public static String multiply(String num1, String num2){
        //���ַ���ת����char����
        char chars1[] = num1.toCharArray();
        char chars2[] = num2.toCharArray();

        //������Ž���������˻�������
        int result[] = new int[chars1.length + chars2.length];
        int n1[] = new int[chars1.length];
        int n2[] = new int[chars2.length];

        //��charת����int���飬ΪʲôҪ��ȥһ��'0'�أ���ΪҪ��ȥ0��ascii��õ��ľ���ʵ�ʵ�����
        for(int i = 0; i < chars1.length;i++)
            n1[i] = chars1[i]-'0';
        for(int i = 0; i < chars2.length;i++)
            n2[i] = chars2[i]-'0';

        //�����ˣ���Ϊ��ᷢ�֡�AB*CD = AC(BC+AD)BD , Ȼ���λ��
        for(int i =0 ; i < chars1.length; i++){
            for(int j =0; j < chars2.length; j++){
                result[i+j]+=n1[i]*n2[j];
            }
        }

        //��10��λ���Ӻ���ǰ��ʮ��λ
        for(int i =result.length-1; i > 0 ;i--){
            result[i-1] += result[i] / 10;
            result[i] = result[i] % 10;
        }

        //ת��string������
        String resultStr = "";
        for(int i = 0; i < result.length-1; i++){
            resultStr+=""+result[i];
        }
        return resultStr;
    }
}
