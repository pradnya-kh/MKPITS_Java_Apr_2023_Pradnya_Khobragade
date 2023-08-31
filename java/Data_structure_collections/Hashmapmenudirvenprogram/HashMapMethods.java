package Hashmapmenudirvenprogram;
import java.util.HashMap;
        import java.util.Iterator;
        import java.util.Set;

public class HashMapMethods {
    HashMap<Integer,String> hashMap=new HashMap();

    public void addNew(Integer cityCode,String cityName){

        hashMap.put(cityCode,cityName);
    }

    public void displayAllData(){
        Set set=hashMap.entrySet();
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void findCity(Integer cityCode){
        System.out.println(hashMap.get(cityCode));
    }

    public void deleteData(Integer cityCode){
        hashMap.remove(cityCode);
        System.out.println("Data Deleted");
    }

    public void updateData(Integer cityCode,String newCityName){
        hashMap.replace(cityCode,newCityName);
        System.out.println(" Updated Data");
    }

    public void clearAllData(){
        hashMap.clear();
        System.out.println("All the data is deleted.");
    }

}
