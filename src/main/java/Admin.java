public class Admin extends User implements IEliminar, IPublicar {
    
    public Admin() {
        super(); // Llama al constructor vacío de User
    }

    @Override
    public String publicar(Contenido c) {
        return "Contenido publicado!";
    }

    @Override
    public String eliminar(Contenido c) {
        return "Contenido eliminado!";
    }
}