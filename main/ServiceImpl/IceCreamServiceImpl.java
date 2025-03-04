@Service
public class IceCreamServiceImpl implements IceCreamService 
{

    @Autowired
    private IceCreamRepository iceCreamRepository;

    @Override
    public IceCreamDTO addIceCream(IceCreamDTO iceCreamDTO) 
    {
        IceCream iceCream = new VanillaIceCream(); // Default to Vanilla
        iceCream.setFlavorName(iceCreamDTO.getFlavorName());
        IceCream savedIceCream = iceCreamRepository.save(iceCream);
        return new IceCreamDTO(savedIceCream.getId(), savedIceCream.getFlavorName());
    }

    @Override
    public List<IceCreamDTO> getAllIceCreams() {
        return iceCreamRepository.findAll().stream()
                .map(iceCream -> new IceCreamDTO(iceCream.getId(), iceCream.getFlavorName()))
                .collect(Collectors.toList());
    }

    @Override
    public IceCreamDTO getIceCreamById(Long id) {
        IceCream iceCream = iceCreamRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ice cream not found"));
        return new IceCreamDTO(iceCream.getId(), iceCream.getFlavorName());
    }

    @Override
    public void deleteIceCream(Long id) {
        iceCreamRepository.deleteById(id);
    }
}

