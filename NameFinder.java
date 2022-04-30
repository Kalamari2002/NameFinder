public class NameFinder{
    public boolean FindNames(String[] names, String name){
        for(int i = 0; i < names.length; i++){
            if(name.equals(names[i])){
                return true;
            }
        }

        return false;
    }
}
