@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/teste")
    public String teste() {
        return "TESTE";
    }

    @GetMapping
    public