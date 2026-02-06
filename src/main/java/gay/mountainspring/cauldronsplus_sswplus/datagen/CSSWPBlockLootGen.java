package gay.mountainspring.cauldronsplus_sswplus.datagen;

import java.util.concurrent.CompletableFuture;

import gay.mountainspring.cauldronsplus.datagen.CauldronsBlockLootGen;
import gay.mountainspring.cauldronsplus_sswplus.block.CSSWPBlocks;
import gay.mountainspring.sswplus.item.SSWPItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;

public class CSSWPBlockLootGen extends CauldronsBlockLootGen {
	public CSSWPBlockLootGen(FabricDataOutput dataOutput, CompletableFuture<WrapperLookup> registryLookup) {
		super(dataOutput, registryLookup);
	}
	
	@Override
	public void generate() {
		this.addDrop(CSSWPBlocks.GOLD_DYED_WATER_CAULDRON, SSWPItems.GOLD_CAULDRON);
		this.addDrop(CSSWPBlocks.GOLD_POTION_CAULDRON, SSWPItems.GOLD_CAULDRON);
		this.addDrop(CSSWPBlocks.GOLD_MILK_CAULDRON, SSWPItems.GOLD_CAULDRON);
		this.addDrop(CSSWPBlocks.GOLD_HONEY_CAULDRON, block -> this.honeyCauldronDrops(block, SSWPItems.GOLD_CAULDRON));
		this.addDrop(CSSWPBlocks.GOLD_SLIME_CAULDRON, block -> this.slimeCauldronDrops(block, SSWPItems.GOLD_CAULDRON));
		
		this.addDrop(CSSWPBlocks.NETHERITE_DYED_WATER_CAULDRON, SSWPItems.NETHERITE_CAULDRON);
		this.addDrop(CSSWPBlocks.NETHERITE_POTION_CAULDRON, SSWPItems.NETHERITE_CAULDRON);
		this.addDrop(CSSWPBlocks.NETHERITE_MILK_CAULDRON, SSWPItems.NETHERITE_CAULDRON);
		this.addDrop(CSSWPBlocks.NETHERITE_HONEY_CAULDRON, block -> this.honeyCauldronDrops(block, SSWPItems.NETHERITE_CAULDRON));
		this.addDrop(CSSWPBlocks.NETHERITE_SLIME_CAULDRON, block -> this.slimeCauldronDrops(block, SSWPItems.NETHERITE_CAULDRON));
		
		this.addDrop(CSSWPBlocks.COPPER_DYED_WATER_CAULDRON, SSWPItems.COPPER_CAULDRON);
		this.addDrop(CSSWPBlocks.COPPER_POTION_CAULDRON, SSWPItems.COPPER_CAULDRON);
		this.addDrop(CSSWPBlocks.COPPER_MILK_CAULDRON, SSWPItems.COPPER_CAULDRON);
		this.addDrop(CSSWPBlocks.COPPER_HONEY_CAULDRON, block -> this.honeyCauldronDrops(block, SSWPItems.COPPER_CAULDRON));
		this.addDrop(CSSWPBlocks.COPPER_SLIME_CAULDRON, block -> this.slimeCauldronDrops(block, SSWPItems.COPPER_CAULDRON));
		this.addDrop(CSSWPBlocks.EXPOSED_COPPER_DYED_WATER_CAULDRON, SSWPItems.EXPOSED_COPPER_CAULDRON);
		this.addDrop(CSSWPBlocks.EXPOSED_COPPER_POTION_CAULDRON, SSWPItems.EXPOSED_COPPER_CAULDRON);
		this.addDrop(CSSWPBlocks.EXPOSED_COPPER_MILK_CAULDRON, SSWPItems.EXPOSED_COPPER_CAULDRON);
		this.addDrop(CSSWPBlocks.EXPOSED_COPPER_HONEY_CAULDRON, block -> this.honeyCauldronDrops(block, SSWPItems.EXPOSED_COPPER_CAULDRON));
		this.addDrop(CSSWPBlocks.EXPOSED_COPPER_SLIME_CAULDRON, block -> this.slimeCauldronDrops(block, SSWPItems.EXPOSED_COPPER_CAULDRON));
		this.addDrop(CSSWPBlocks.WEATHERED_COPPER_DYED_WATER_CAULDRON, SSWPItems.WEATHERED_COPPER_CAULDRON);
		this.addDrop(CSSWPBlocks.WEATHERED_COPPER_POTION_CAULDRON, SSWPItems.WEATHERED_COPPER_CAULDRON);
		this.addDrop(CSSWPBlocks.WEATHERED_COPPER_MILK_CAULDRON, SSWPItems.WEATHERED_COPPER_CAULDRON);
		this.addDrop(CSSWPBlocks.WEATHERED_COPPER_HONEY_CAULDRON, block -> this.honeyCauldronDrops(block, SSWPItems.WEATHERED_COPPER_CAULDRON));
		this.addDrop(CSSWPBlocks.WEATHERED_COPPER_SLIME_CAULDRON, block -> this.slimeCauldronDrops(block, SSWPItems.WEATHERED_COPPER_CAULDRON));
		this.addDrop(CSSWPBlocks.OXIDIZED_COPPER_DYED_WATER_CAULDRON, SSWPItems.OXIDIZED_COPPER_CAULDRON);
		this.addDrop(CSSWPBlocks.OXIDIZED_COPPER_POTION_CAULDRON, SSWPItems.OXIDIZED_COPPER_CAULDRON);
		this.addDrop(CSSWPBlocks.OXIDIZED_COPPER_MILK_CAULDRON, SSWPItems.OXIDIZED_COPPER_CAULDRON);
		this.addDrop(CSSWPBlocks.OXIDIZED_COPPER_HONEY_CAULDRON, block -> this.honeyCauldronDrops(block, SSWPItems.OXIDIZED_COPPER_CAULDRON));
		this.addDrop(CSSWPBlocks.OXIDIZED_COPPER_SLIME_CAULDRON, block -> this.slimeCauldronDrops(block, SSWPItems.OXIDIZED_COPPER_CAULDRON));
		this.addDrop(CSSWPBlocks.WAXED_COPPER_DYED_WATER_CAULDRON, SSWPItems.WAXED_COPPER_CAULDRON);
		this.addDrop(CSSWPBlocks.WAXED_COPPER_POTION_CAULDRON, SSWPItems.WAXED_COPPER_CAULDRON);
		this.addDrop(CSSWPBlocks.WAXED_COPPER_MILK_CAULDRON, SSWPItems.WAXED_COPPER_CAULDRON);
		this.addDrop(CSSWPBlocks.WAXED_COPPER_HONEY_CAULDRON, block -> this.honeyCauldronDrops(block, SSWPItems.WAXED_COPPER_CAULDRON));
		this.addDrop(CSSWPBlocks.WAXED_COPPER_SLIME_CAULDRON, block -> this.slimeCauldronDrops(block, SSWPItems.WAXED_COPPER_CAULDRON));
		this.addDrop(CSSWPBlocks.WAXED_EXPOSED_COPPER_DYED_WATER_CAULDRON, SSWPItems.WAXED_EXPOSED_COPPER_CAULDRON);
		this.addDrop(CSSWPBlocks.WAXED_EXPOSED_COPPER_POTION_CAULDRON, SSWPItems.WAXED_EXPOSED_COPPER_CAULDRON);
		this.addDrop(CSSWPBlocks.WAXED_EXPOSED_COPPER_MILK_CAULDRON, SSWPItems.WAXED_EXPOSED_COPPER_CAULDRON);
		this.addDrop(CSSWPBlocks.WAXED_EXPOSED_COPPER_HONEY_CAULDRON, block -> this.honeyCauldronDrops(block, SSWPItems.WAXED_EXPOSED_COPPER_CAULDRON));
		this.addDrop(CSSWPBlocks.WAXED_EXPOSED_COPPER_SLIME_CAULDRON, block -> this.slimeCauldronDrops(block, SSWPItems.WAXED_EXPOSED_COPPER_CAULDRON));
		this.addDrop(CSSWPBlocks.WAXED_WEATHERED_COPPER_DYED_WATER_CAULDRON, SSWPItems.WAXED_WEATHERED_COPPER_CAULDRON);
		this.addDrop(CSSWPBlocks.WAXED_WEATHERED_COPPER_POTION_CAULDRON, SSWPItems.WAXED_WEATHERED_COPPER_CAULDRON);
		this.addDrop(CSSWPBlocks.WAXED_WEATHERED_COPPER_MILK_CAULDRON, SSWPItems.WAXED_WEATHERED_COPPER_CAULDRON);
		this.addDrop(CSSWPBlocks.WAXED_WEATHERED_COPPER_HONEY_CAULDRON, block -> this.honeyCauldronDrops(block, SSWPItems.WAXED_WEATHERED_COPPER_CAULDRON));
		this.addDrop(CSSWPBlocks.WAXED_WEATHERED_COPPER_SLIME_CAULDRON, block -> this.slimeCauldronDrops(block, SSWPItems.WAXED_WEATHERED_COPPER_CAULDRON));
		this.addDrop(CSSWPBlocks.WAXED_OXIDIZED_COPPER_DYED_WATER_CAULDRON, SSWPItems.WAXED_OXIDIZED_COPPER_CAULDRON);
		this.addDrop(CSSWPBlocks.WAXED_OXIDIZED_COPPER_POTION_CAULDRON, SSWPItems.WAXED_OXIDIZED_COPPER_CAULDRON);
		this.addDrop(CSSWPBlocks.WAXED_OXIDIZED_COPPER_MILK_CAULDRON, SSWPItems.WAXED_OXIDIZED_COPPER_CAULDRON);
		this.addDrop(CSSWPBlocks.WAXED_OXIDIZED_COPPER_HONEY_CAULDRON, block -> this.honeyCauldronDrops(block, SSWPItems.WAXED_OXIDIZED_COPPER_CAULDRON));
		this.addDrop(CSSWPBlocks.WAXED_OXIDIZED_COPPER_SLIME_CAULDRON, block -> this.slimeCauldronDrops(block, SSWPItems.WAXED_OXIDIZED_COPPER_CAULDRON));
	}
}