class MyStack{
    int top;
	int arr[] = new int[1000];
    MyStack(){
		top = -1;
	}
    void push(int a){
	    arr[++top]=a;
	}
	int pop(){
        if(top==-1) return -1;
        return arr[top--];
	}
}
public class GFG {
    public static void main(String[] args) {
        MyStack st=new MyStack();
        st.push(1);
        st.push(2);;
    }
}