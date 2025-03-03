public interface IceCreamService {
    IceCreamDTO addIceCream(IceCreamDTO iceCreamDTO);
    List<IceCreamDTO> getAllIceCreams();
    IceCreamDTO getIceCreamById(Long id);
    void deleteIceCream(Long id);
}

