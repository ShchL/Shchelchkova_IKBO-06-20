public class MyArrList<E> {

    private final int defoultSize = 20;
    private Object[] arr;
    private int ptr = 0;

    //Конструктор с количеством элементов списка
    public MyArrList(int maxLength) {
        arr = new Object[maxLength];
    }

    //Конструктор по-умолчанию
    public MyArrList() {
        arr = new Object[defoultSize];
    }

    //Метод add(E item) – добавления нового элемента в конец списка
    public void add(E item){
        if(ptr == arr.length-1){
            resize(arr.length*2);
        }
        arr[ptr++] = item;
    }

    /*Метод add(E item, int index) – добавления нового элемента в середину списка,
    со смещением имеющихся элементов в право*/
    public void add(E item, int index){
        if(index >= ptr){
            if(ptr == arr.length-1){
                resize(arr.length*2);
            }
            arr[ptr++] = item;
        }else{
            if(ptr == arr.length-1){
                resize(arr.length*2);
            }
            System.arraycopy(arr,index+1,arr,index,ptr);
            arr[index] = item;
        }
    }

    private void resize(int size){
        Object[] newArray = new Object[size];
        System.arraycopy(arr,0,newArray,0,ptr);
        arr=newArray;
    }

    //Метод clear() – удаления всех элементов
    public void clear(){
        ptr = 0;
        arr = new Object[arr.length];
    }

    //Метод isEmpty() – проверяет является ли данный список пустым
    public Boolean isEmpty(){
        return ptr==0;
    }

    //Метод size() – возвращает число элементов, хранящихся в списке
    public int size(){
        return ptr;
    }

    //Метод toString() возвращает содержимое списка (приведенные к строке элементы) через запятую
    public String toString(){
        String ans="";
        for(int i = 0 ; i < ptr; ++i){
            ans=ans.concat(arr[i].toString()).concat(" ");
        }
        return ans;
    }
}
