import java.util.ArrayList;
import java.util.List;
public class plRepository {
    private List<ProgrammingLanguage> languages= new ArrayList<>();

    public void add(ProgrammingLanguage language){
        languages.add(language);
    }
    public List<ProgrammingLanguage> getAll(){
        return languages;
    }
    public ProgrammingLanguage getById(int id){
        for(ProgrammingLanguage language:languages){
            if(language.getId()==id){
                return language;
            }
        }
        return null;
    }
    public void update(int id, String newName){
        ProgrammingLanguage language=getById(id);
        if (language!= null){
            language.setName(newName);
        }
    }
    public void delete(int id){
        languages.removeIf(lang -> lang.getId()== id);
    }

}
