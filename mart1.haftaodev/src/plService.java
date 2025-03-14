import java.util.List;
public class plService {
    private plRepository repository=new plRepository();

    public void addLanguage(int id, String name){
        if(name== null || name.isEmpty()){
            System.out.println("Dil adı boş olamaz.");
            return;
        }
        repository.add(new ProgrammingLanguage(id,name));
    }
    public List<ProgrammingLanguage> getAlllanguages(){
        return repository.getAll();
    }
    public ProgrammingLanguage getLanguageById(int id){
        return repository.getById(id);
    }
    public void updateLanguage(int id, String newName){
        repository.update(id, newName);
    }
    public void deleteLanguage(int id){
        repository.delete(id);
    }


}
