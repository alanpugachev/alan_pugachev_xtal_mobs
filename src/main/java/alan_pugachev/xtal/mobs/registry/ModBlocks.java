package alan_pugachev.xtal.mobs.registry;

import alan_pugachev.xtal.mobs.XtalMobs;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    
    public static final Block XTAL_BLOCK = new Block(FabricBlockSettings
        .of(Material.METAL)
        .breakByTool(FabricToolTags.PICKAXES, 2)
        .requiresTool()
        .strength(5.0f, 30.0f)
        .sounds(BlockSoundGroup.METAL)
        .luminance(4));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(XtalMobs.MOD_ID, "xtal_block"), XTAL_BLOCK);
    }
}
