public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.SetNombre("Irvin");
        persona.SetEdad((byte) 17);
        persona.SetTelefono(1234567891);
        System.out.println(persona.GetNombre());
        System.out.println(persona.GetEdad());
        System.out.println(persona.GetTelefono());
    }
}
class Persona{
    private String Nombre;
    private byte Edad;
    private int Telefono;

    public void SetNombre (String Nombre){
        this.Nombre = Nombre;
    }
    public String GetNombre (){
        return this.Nombre;
    }

    public void SetEdad(byte Edad){
        this.Edad = Edad;
    }
    public byte GetEdad(){
        return this.Edad;
    }

    public void SetTelefono(int Telefono){
        this.Telefono=Telefono;
    }
    public int GetTelefono(){
        return this.Telefono;
    }
}