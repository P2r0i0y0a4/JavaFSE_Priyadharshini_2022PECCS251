@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryRepository repo;

    @PostMapping
    public Inventory updateInventory(@RequestBody Inventory inventory) {
        return repo.save(inventory);
    }

    @GetMapping("/product/{productId}")
    public Inventory getByProduct(@PathVariable Long productId) {
        return repo.findByProductId(productId);
    }
}
