@RestController
@RequestMapping("/api/icecreams")
public class IceCreamController 
{

    @Autowired
    private IceCreamService iceCreamService;

    @PostMapping
    public IceCreamDTO addIceCream(@RequestBody IceCreamDTO iceCreamDTO) 
    {
        return iceCreamService.addIceCream(iceCreamDTO);
    }

    @GetMapping
    public List<IceCreamDTO> getAllIceCreams() 
    {
        return iceCreamService.getAllIceCreams();
    }

    @GetMapping("/{id}")
    public IceCreamDTO getIceCreamById(@PathVariable Long id) 
    {
        return iceCreamService.getIceCreamById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteIceCream(@PathVariable Long id) 
    {
        iceCreamService.deleteIceCream(id);
    }
}

