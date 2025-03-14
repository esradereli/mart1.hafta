import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        plService service= new plService();
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("-------------------\n1-Dil ekle\n2-Dilleri Listele\n3-ID ile Dil Getir\n4-Dili Güncelle\n5-Dili Sil\n6-Çıkış");
            System.out.println("Seçim yapınız:");
            int choice= scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    System.out.println("Dil ID: ");
                    int id=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Dil Adı: ");
                    String name=scanner.nextLine();
                    service.addLanguage(id,name);
                    break;
                case 2:
                    for (ProgrammingLanguage lang: service.getAlllanguages()){
                        System.out.println(lang.getId()+"-"+ lang.getName());
                    }
                    break;
                case 3:
                    System.out.println("Dil ID: ");
                    int searchID= scanner.nextInt();
                    ProgrammingLanguage lang= service.getLanguageById(searchID);
                    if (lang!=null){
                        System.out.println("Bulunan Dil: "+lang.getName());
                    }else {
                        System.out.println("Dil bulunamadı.");
                    }
                    break;
                case 4:
                    System.out.println("Güncellencek dil ID:");
                    int updateID= scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Yeni dil adı: ");
                    String newName=scanner.nextLine();
                    service.updateLanguage(updateID, newName);
                    break;
                case 5:
                    System.out.println("Silinecek dil ID: ");
                    int deleteID= scanner.nextInt();
                    service.deleteLanguage(deleteID);
                    break;
                case 6:
                    System.out.println("Çıkış yapılıyor..");
                    scanner.close();
                    return;
                default:
                    System.out.println("Geçersiz seçim.");
            }
        }

    }
}