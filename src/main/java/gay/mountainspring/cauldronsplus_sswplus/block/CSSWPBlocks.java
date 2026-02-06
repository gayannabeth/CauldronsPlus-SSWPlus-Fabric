package gay.mountainspring.cauldronsplus_sswplus.block;

import gay.mountainspring.aquifer.util.BlockUtil;
import gay.mountainspring.cauldronsplus.block.DyedWaterCauldronBlock;
import gay.mountainspring.cauldronsplus.block.HoneyCauldronBlock;
import gay.mountainspring.cauldronsplus.block.MilkCauldronBlock;
import gay.mountainspring.cauldronsplus.block.PotionCauldronBlock;
import gay.mountainspring.cauldronsplus.block.SlimeCauldronBlock;
import gay.mountainspring.cauldronsplus.block.entity.CauldronBlockEntityTypes;
import gay.mountainspring.cauldronsplus_sswplus.CSSWPlus;
import gay.mountainspring.sswplus.block.SSWPBlocks;
import gay.mountainspring.sswplus.block.SSWPCauldronGroups;
import gay.mountainspring.sswplus.item.SSWPItems;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Oxidizable;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.poi.PointOfInterestTypes;

public class CSSWPBlocks {
	private CSSWPBlocks() {}
	
	public static void init() {}
	
	public static final Block GOLD_DYED_WATER_CAULDRON = register("gold_dyed_water_cauldron", new DyedWaterCauldronBlock(SSWPCauldronGroups.GOLD, AbstractBlock.Settings.copy(SSWPBlocks.GOLD_CAULDRON)));
	public static final Block GOLD_POTION_CAULDRON = register("gold_potion_cauldron", new PotionCauldronBlock(SSWPCauldronGroups.GOLD, AbstractBlock.Settings.copy(SSWPBlocks.GOLD_CAULDRON).luminance(state -> 1)));
	public static final Block GOLD_MILK_CAULDRON = register("gold_milk_cauldron", new MilkCauldronBlock(SSWPCauldronGroups.GOLD, AbstractBlock.Settings.copy(SSWPBlocks.GOLD_CAULDRON)));
	public static final Block GOLD_HONEY_CAULDRON = register("gold_honey_cauldron", new HoneyCauldronBlock(SSWPCauldronGroups.GOLD, AbstractBlock.Settings.copy(SSWPBlocks.GOLD_CAULDRON).jumpVelocityMultiplier(0.5f).velocityMultiplier(0.4f)));
	public static final Block GOLD_SLIME_CAULDRON = register("gold_slime_cauldron", new SlimeCauldronBlock(SSWPCauldronGroups.GOLD, AbstractBlock.Settings.copy(SSWPBlocks.GOLD_CAULDRON).slipperiness(0.8f)));
	
	public static final Block NETHERITE_DYED_WATER_CAULDRON = register("netherite_dyed_water_cauldron", new DyedWaterCauldronBlock(SSWPCauldronGroups.NETHERITE, AbstractBlock.Settings.copy(SSWPBlocks.NETHERITE_CAULDRON)));
	public static final Block NETHERITE_POTION_CAULDRON = register("netherite_potion_cauldron", new PotionCauldronBlock(SSWPCauldronGroups.NETHERITE, AbstractBlock.Settings.copy(SSWPBlocks.NETHERITE_CAULDRON).luminance(state -> 1)));
	public static final Block NETHERITE_MILK_CAULDRON = register("netherite_milk_cauldron", new MilkCauldronBlock(SSWPCauldronGroups.NETHERITE, AbstractBlock.Settings.copy(SSWPBlocks.NETHERITE_CAULDRON)));
	public static final Block NETHERITE_HONEY_CAULDRON = register("netherite_honey_cauldron", new HoneyCauldronBlock(SSWPCauldronGroups.NETHERITE, AbstractBlock.Settings.copy(SSWPBlocks.NETHERITE_CAULDRON).jumpVelocityMultiplier(0.5f).velocityMultiplier(0.4f)));
	public static final Block NETHERITE_SLIME_CAULDRON = register("netherite_slime_cauldron", new SlimeCauldronBlock(SSWPCauldronGroups.NETHERITE, AbstractBlock.Settings.copy(SSWPBlocks.NETHERITE_CAULDRON).slipperiness(0.8f)));
	
	public static final Block COPPER_DYED_WATER_CAULDRON = register("copper_dyed_water_cauldron", new OxidizableDyedWaterCauldronBlock(Oxidizable.OxidationLevel.UNAFFECTED, SSWPCauldronGroups.COPPER, AbstractBlock.Settings.copy(SSWPBlocks.COPPER_CAULDRON)));
	public static final Block COPPER_POTION_CAULDRON = register("copper_potion_cauldron", new OxidizablePotionCauldronBlock(Oxidizable.OxidationLevel.UNAFFECTED, SSWPCauldronGroups.COPPER, AbstractBlock.Settings.copy(SSWPBlocks.COPPER_CAULDRON).luminance(state -> 1)));
	public static final Block COPPER_MILK_CAULDRON = register("copper_milk_cauldron", new OxidizableMilkCauldronBlock(Oxidizable.OxidationLevel.UNAFFECTED, SSWPCauldronGroups.COPPER, AbstractBlock.Settings.copy(SSWPBlocks.COPPER_CAULDRON)));
	public static final Block COPPER_HONEY_CAULDRON = register("copper_honey_cauldron", new OxidizableHoneyCauldronBlock(Oxidizable.OxidationLevel.UNAFFECTED, SSWPCauldronGroups.COPPER, AbstractBlock.Settings.copy(SSWPBlocks.COPPER_CAULDRON).jumpVelocityMultiplier(0.5f).velocityMultiplier(0.4f)));
	public static final Block COPPER_SLIME_CAULDRON = register("copper_slime_cauldron", new OxidizableSlimeCauldronBlock(Oxidizable.OxidationLevel.UNAFFECTED, SSWPCauldronGroups.COPPER, AbstractBlock.Settings.copy(SSWPBlocks.COPPER_CAULDRON).slipperiness(0.8f)));
	public static final Block EXPOSED_COPPER_DYED_WATER_CAULDRON = register("exposed_copper_dyed_water_cauldron", new OxidizableDyedWaterCauldronBlock(Oxidizable.OxidationLevel.EXPOSED, SSWPCauldronGroups.EXPOSED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.EXPOSED_COPPER_CAULDRON)));
	public static final Block EXPOSED_COPPER_POTION_CAULDRON = register("exposed_copper_potion_cauldron", new OxidizablePotionCauldronBlock(Oxidizable.OxidationLevel.EXPOSED, SSWPCauldronGroups.EXPOSED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.EXPOSED_COPPER_CAULDRON).luminance(state -> 1)));
	public static final Block EXPOSED_COPPER_MILK_CAULDRON = register("exposed_copper_milk_cauldron", new OxidizableMilkCauldronBlock(Oxidizable.OxidationLevel.EXPOSED, SSWPCauldronGroups.EXPOSED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.EXPOSED_COPPER_CAULDRON)));
	public static final Block EXPOSED_COPPER_HONEY_CAULDRON = register("exposed_copper_honey_cauldron", new OxidizableHoneyCauldronBlock(Oxidizable.OxidationLevel.EXPOSED, SSWPCauldronGroups.EXPOSED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.EXPOSED_COPPER_CAULDRON).jumpVelocityMultiplier(0.5f).velocityMultiplier(0.4f)));
	public static final Block EXPOSED_COPPER_SLIME_CAULDRON = register("exposed_copper_slime_cauldron", new OxidizableSlimeCauldronBlock(Oxidizable.OxidationLevel.EXPOSED, SSWPCauldronGroups.EXPOSED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.EXPOSED_COPPER_CAULDRON).slipperiness(0.8f)));
	public static final Block WEATHERED_COPPER_DYED_WATER_CAULDRON = register("weathered_copper_dyed_water_cauldron", new OxidizableDyedWaterCauldronBlock(Oxidizable.OxidationLevel.WEATHERED, SSWPCauldronGroups.WEATHERED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.WEATHERED_COPPER_CAULDRON)));
	public static final Block WEATHERED_COPPER_POTION_CAULDRON = register("weathered_copper_potion_cauldron", new OxidizablePotionCauldronBlock(Oxidizable.OxidationLevel.WEATHERED, SSWPCauldronGroups.WEATHERED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.WEATHERED_COPPER_CAULDRON).luminance(state -> 1)));
	public static final Block WEATHERED_COPPER_MILK_CAULDRON = register("weathered_copper_milk_cauldron", new OxidizableMilkCauldronBlock(Oxidizable.OxidationLevel.WEATHERED, SSWPCauldronGroups.WEATHERED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.WEATHERED_COPPER_CAULDRON)));
	public static final Block WEATHERED_COPPER_HONEY_CAULDRON = register("weathered_copper_honey_cauldron", new OxidizableHoneyCauldronBlock(Oxidizable.OxidationLevel.WEATHERED, SSWPCauldronGroups.WEATHERED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.WEATHERED_COPPER_CAULDRON).jumpVelocityMultiplier(0.5f).velocityMultiplier(0.4f)));
	public static final Block WEATHERED_COPPER_SLIME_CAULDRON = register("weathered_copper_slime_cauldron", new OxidizableSlimeCauldronBlock(Oxidizable.OxidationLevel.WEATHERED, SSWPCauldronGroups.WEATHERED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.WEATHERED_COPPER_CAULDRON).slipperiness(0.8f)));
	public static final Block OXIDIZED_COPPER_DYED_WATER_CAULDRON = register("oxidized_copper_dyed_water_cauldron", new OxidizableDyedWaterCauldronBlock(Oxidizable.OxidationLevel.OXIDIZED, SSWPCauldronGroups.OXIDIZED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.OXIDIZED_COPPER_CAULDRON)));
	public static final Block OXIDIZED_COPPER_POTION_CAULDRON = register("oxidized_copper_potion_cauldron", new OxidizablePotionCauldronBlock(Oxidizable.OxidationLevel.OXIDIZED, SSWPCauldronGroups.OXIDIZED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.OXIDIZED_COPPER_CAULDRON).luminance(state -> 1)));
	public static final Block OXIDIZED_COPPER_MILK_CAULDRON = register("oxidized_copper_milk_cauldron", new OxidizableMilkCauldronBlock(Oxidizable.OxidationLevel.OXIDIZED, SSWPCauldronGroups.OXIDIZED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.OXIDIZED_COPPER_CAULDRON)));
	public static final Block OXIDIZED_COPPER_HONEY_CAULDRON = register("oxidized_copper_honey_cauldron", new OxidizableHoneyCauldronBlock(Oxidizable.OxidationLevel.OXIDIZED, SSWPCauldronGroups.OXIDIZED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.OXIDIZED_COPPER_CAULDRON).jumpVelocityMultiplier(0.5f).velocityMultiplier(0.4f)));
	public static final Block OXIDIZED_COPPER_SLIME_CAULDRON = register("oxidized_copper_slime_cauldron", new OxidizableSlimeCauldronBlock(Oxidizable.OxidationLevel.OXIDIZED, SSWPCauldronGroups.OXIDIZED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.OXIDIZED_COPPER_CAULDRON).slipperiness(0.8f)));
	public static final Block WAXED_COPPER_DYED_WATER_CAULDRON = register("waxed_copper_dyed_water_cauldron", new DyedWaterCauldronBlock(SSWPCauldronGroups.WAXED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.WAXED_COPPER_CAULDRON)));
	public static final Block WAXED_COPPER_POTION_CAULDRON = register("waxed_copper_potion_cauldron", new PotionCauldronBlock(SSWPCauldronGroups.WAXED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.WAXED_COPPER_CAULDRON).luminance(state -> 1)));
	public static final Block WAXED_COPPER_MILK_CAULDRON = register("waxed_copper_milk_cauldron", new MilkCauldronBlock(SSWPCauldronGroups.WAXED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.WAXED_COPPER_CAULDRON)));
	public static final Block WAXED_COPPER_HONEY_CAULDRON = register("waxed_copper_honey_cauldron", new HoneyCauldronBlock(SSWPCauldronGroups.WAXED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.WAXED_COPPER_CAULDRON).jumpVelocityMultiplier(0.5f).velocityMultiplier(0.4f)));
	public static final Block WAXED_COPPER_SLIME_CAULDRON = register("waxed_copper_slime_cauldron", new SlimeCauldronBlock(SSWPCauldronGroups.WAXED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.WAXED_COPPER_CAULDRON).slipperiness(0.8f)));
	public static final Block WAXED_EXPOSED_COPPER_DYED_WATER_CAULDRON = register("waxed_exposed_copper_dyed_water_cauldron", new DyedWaterCauldronBlock(SSWPCauldronGroups.WAXED_EXPOSED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.WAXED_EXPOSED_COPPER_CAULDRON)));
	public static final Block WAXED_EXPOSED_COPPER_POTION_CAULDRON = register("waxed_exposed_copper_potion_cauldron", new PotionCauldronBlock(SSWPCauldronGroups.WAXED_EXPOSED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.WAXED_EXPOSED_COPPER_CAULDRON).luminance(state -> 1)));
	public static final Block WAXED_EXPOSED_COPPER_MILK_CAULDRON = register("waxed_exposed_copper_milk_cauldron", new MilkCauldronBlock(SSWPCauldronGroups.WAXED_EXPOSED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.WAXED_EXPOSED_COPPER_CAULDRON)));
	public static final Block WAXED_EXPOSED_COPPER_HONEY_CAULDRON = register("waxed_exposed_copper_honey_cauldron", new HoneyCauldronBlock(SSWPCauldronGroups.WAXED_EXPOSED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.WAXED_EXPOSED_COPPER_CAULDRON).jumpVelocityMultiplier(0.5f).velocityMultiplier(0.4f)));
	public static final Block WAXED_EXPOSED_COPPER_SLIME_CAULDRON = register("waxed_exposed_copper_slime_cauldron", new SlimeCauldronBlock(SSWPCauldronGroups.WAXED_EXPOSED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.WAXED_EXPOSED_COPPER_CAULDRON).slipperiness(0.8f)));
	public static final Block WAXED_WEATHERED_COPPER_DYED_WATER_CAULDRON = register("waxed_weathered_copper_dyed_water_cauldron", new DyedWaterCauldronBlock(SSWPCauldronGroups.WAXED_WEATHERED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.WAXED_WEATHERED_COPPER_CAULDRON)));
	public static final Block WAXED_WEATHERED_COPPER_POTION_CAULDRON = register("waxed_weathered_copper_potion_cauldron", new PotionCauldronBlock(SSWPCauldronGroups.WAXED_WEATHERED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.WAXED_WEATHERED_COPPER_CAULDRON).luminance(state -> 1)));
	public static final Block WAXED_WEATHERED_COPPER_MILK_CAULDRON = register("waxed_weathered_copper_milk_cauldron", new MilkCauldronBlock(SSWPCauldronGroups.WAXED_WEATHERED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.WAXED_WEATHERED_COPPER_CAULDRON)));
	public static final Block WAXED_WEATHERED_COPPER_HONEY_CAULDRON = register("waxed_weathered_copper_honey_cauldron", new HoneyCauldronBlock(SSWPCauldronGroups.WAXED_WEATHERED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.WAXED_WEATHERED_COPPER_CAULDRON).jumpVelocityMultiplier(0.5f).velocityMultiplier(0.4f)));
	public static final Block WAXED_WEATHERED_COPPER_SLIME_CAULDRON = register("waxed_weathered_copper_slime_cauldron", new SlimeCauldronBlock(SSWPCauldronGroups.WAXED_WEATHERED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.WAXED_WEATHERED_COPPER_CAULDRON).slipperiness(0.8f)));
	public static final Block WAXED_OXIDIZED_COPPER_DYED_WATER_CAULDRON = register("waxed_oxidized_copper_dyed_water_cauldron", new DyedWaterCauldronBlock(SSWPCauldronGroups.WAXED_OXIDIZED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.WAXED_OXIDIZED_COPPER_CAULDRON)));
	public static final Block WAXED_OXIDIZED_COPPER_POTION_CAULDRON = register("waxed_oxidized_copper_potion_cauldron", new PotionCauldronBlock(SSWPCauldronGroups.WAXED_OXIDIZED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.WAXED_OXIDIZED_COPPER_CAULDRON).luminance(state -> 1)));
	public static final Block WAXED_OXIDIZED_COPPER_MILK_CAULDRON = register("waxed_oxidized_copper_milk_cauldron", new MilkCauldronBlock(SSWPCauldronGroups.WAXED_OXIDIZED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.WAXED_OXIDIZED_COPPER_CAULDRON)));
	public static final Block WAXED_OXIDIZED_COPPER_HONEY_CAULDRON = register("waxed_oxidized_copper_honey_cauldron", new HoneyCauldronBlock(SSWPCauldronGroups.WAXED_OXIDIZED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.WAXED_OXIDIZED_COPPER_CAULDRON).jumpVelocityMultiplier(0.5f).velocityMultiplier(0.4f)));
	public static final Block WAXED_OXIDIZED_COPPER_SLIME_CAULDRON = register("waxed_oxidized_copper_slime_cauldron", new SlimeCauldronBlock(SSWPCauldronGroups.WAXED_OXIDIZED_COPPER, AbstractBlock.Settings.copy(SSWPBlocks.WAXED_OXIDIZED_COPPER_CAULDRON).slipperiness(0.8f)));
	
	private static Block register(String name, Block block) {
		return Registry.register(Registries.BLOCK, Identifier.of(CSSWPlus.MOD_ID, name), block);
	}
	
	static {
		CauldronBlockEntityTypes.DYED_WATER_CAULDRON.addSupportedBlock(GOLD_DYED_WATER_CAULDRON);
		CauldronBlockEntityTypes.POTION_CAULDRON.addSupportedBlock(GOLD_POTION_CAULDRON);
		CauldronBlockEntityTypes.DYED_WATER_CAULDRON.addSupportedBlock(NETHERITE_DYED_WATER_CAULDRON);
		CauldronBlockEntityTypes.POTION_CAULDRON.addSupportedBlock(NETHERITE_POTION_CAULDRON);
		CauldronBlockEntityTypes.DYED_WATER_CAULDRON.addSupportedBlock(COPPER_DYED_WATER_CAULDRON);
		CauldronBlockEntityTypes.POTION_CAULDRON.addSupportedBlock(COPPER_POTION_CAULDRON);
		CauldronBlockEntityTypes.DYED_WATER_CAULDRON.addSupportedBlock(EXPOSED_COPPER_DYED_WATER_CAULDRON);
		CauldronBlockEntityTypes.POTION_CAULDRON.addSupportedBlock(EXPOSED_COPPER_POTION_CAULDRON);
		CauldronBlockEntityTypes.DYED_WATER_CAULDRON.addSupportedBlock(WEATHERED_COPPER_DYED_WATER_CAULDRON);
		CauldronBlockEntityTypes.POTION_CAULDRON.addSupportedBlock(WEATHERED_COPPER_POTION_CAULDRON);
		CauldronBlockEntityTypes.DYED_WATER_CAULDRON.addSupportedBlock(OXIDIZED_COPPER_DYED_WATER_CAULDRON);
		CauldronBlockEntityTypes.POTION_CAULDRON.addSupportedBlock(OXIDIZED_COPPER_POTION_CAULDRON);
		CauldronBlockEntityTypes.DYED_WATER_CAULDRON.addSupportedBlock(WAXED_COPPER_DYED_WATER_CAULDRON);
		CauldronBlockEntityTypes.POTION_CAULDRON.addSupportedBlock(WAXED_COPPER_POTION_CAULDRON);
		CauldronBlockEntityTypes.DYED_WATER_CAULDRON.addSupportedBlock(WAXED_EXPOSED_COPPER_DYED_WATER_CAULDRON);
		CauldronBlockEntityTypes.POTION_CAULDRON.addSupportedBlock(WAXED_EXPOSED_COPPER_POTION_CAULDRON);
		CauldronBlockEntityTypes.DYED_WATER_CAULDRON.addSupportedBlock(WAXED_WEATHERED_COPPER_DYED_WATER_CAULDRON);
		CauldronBlockEntityTypes.POTION_CAULDRON.addSupportedBlock(WAXED_WEATHERED_COPPER_POTION_CAULDRON);
		CauldronBlockEntityTypes.DYED_WATER_CAULDRON.addSupportedBlock(WAXED_OXIDIZED_COPPER_DYED_WATER_CAULDRON);
		CauldronBlockEntityTypes.POTION_CAULDRON.addSupportedBlock(WAXED_OXIDIZED_COPPER_POTION_CAULDRON);
		
		BlockUtil.addBlocksToPOI(PointOfInterestTypes.LEATHERWORKER,
				GOLD_DYED_WATER_CAULDRON,
				GOLD_POTION_CAULDRON,
				GOLD_MILK_CAULDRON,
				GOLD_HONEY_CAULDRON,
				GOLD_SLIME_CAULDRON,
				NETHERITE_DYED_WATER_CAULDRON,
				NETHERITE_POTION_CAULDRON,
				NETHERITE_MILK_CAULDRON,
				NETHERITE_HONEY_CAULDRON,
				NETHERITE_SLIME_CAULDRON,
				COPPER_DYED_WATER_CAULDRON,
				COPPER_POTION_CAULDRON,
				COPPER_MILK_CAULDRON,
				COPPER_HONEY_CAULDRON,
				COPPER_SLIME_CAULDRON,
				EXPOSED_COPPER_DYED_WATER_CAULDRON,
				EXPOSED_COPPER_POTION_CAULDRON,
				EXPOSED_COPPER_MILK_CAULDRON,
				EXPOSED_COPPER_HONEY_CAULDRON,
				EXPOSED_COPPER_SLIME_CAULDRON,
				WEATHERED_COPPER_DYED_WATER_CAULDRON,
				WEATHERED_COPPER_POTION_CAULDRON,
				WEATHERED_COPPER_MILK_CAULDRON,
				WEATHERED_COPPER_HONEY_CAULDRON,
				WEATHERED_COPPER_SLIME_CAULDRON,
				OXIDIZED_COPPER_DYED_WATER_CAULDRON,
				OXIDIZED_COPPER_POTION_CAULDRON,
				OXIDIZED_COPPER_MILK_CAULDRON,
				OXIDIZED_COPPER_HONEY_CAULDRON,
				OXIDIZED_COPPER_SLIME_CAULDRON,
				WAXED_COPPER_DYED_WATER_CAULDRON,
				WAXED_COPPER_POTION_CAULDRON,
				WAXED_COPPER_MILK_CAULDRON,
				WAXED_COPPER_HONEY_CAULDRON,
				WAXED_COPPER_SLIME_CAULDRON,
				WAXED_EXPOSED_COPPER_DYED_WATER_CAULDRON,
				WAXED_EXPOSED_COPPER_POTION_CAULDRON,
				WAXED_EXPOSED_COPPER_MILK_CAULDRON,
				WAXED_EXPOSED_COPPER_HONEY_CAULDRON,
				WAXED_EXPOSED_COPPER_SLIME_CAULDRON,
				WAXED_WEATHERED_COPPER_DYED_WATER_CAULDRON,
				WAXED_WEATHERED_COPPER_POTION_CAULDRON,
				WAXED_WEATHERED_COPPER_MILK_CAULDRON,
				WAXED_WEATHERED_COPPER_HONEY_CAULDRON,
				WAXED_WEATHERED_COPPER_SLIME_CAULDRON,
				WAXED_OXIDIZED_COPPER_DYED_WATER_CAULDRON,
				WAXED_OXIDIZED_COPPER_POTION_CAULDRON,
				WAXED_OXIDIZED_COPPER_MILK_CAULDRON,
				WAXED_OXIDIZED_COPPER_HONEY_CAULDRON,
				WAXED_OXIDIZED_COPPER_SLIME_CAULDRON);
		
		Item.BLOCK_ITEMS.put(GOLD_DYED_WATER_CAULDRON, SSWPItems.GOLD_CAULDRON);
		Item.BLOCK_ITEMS.put(GOLD_POTION_CAULDRON, SSWPItems.GOLD_CAULDRON);
		Item.BLOCK_ITEMS.put(GOLD_MILK_CAULDRON, SSWPItems.GOLD_CAULDRON);
		Item.BLOCK_ITEMS.put(GOLD_HONEY_CAULDRON, SSWPItems.GOLD_CAULDRON);
		Item.BLOCK_ITEMS.put(GOLD_SLIME_CAULDRON, SSWPItems.GOLD_CAULDRON);
		Item.BLOCK_ITEMS.put(NETHERITE_DYED_WATER_CAULDRON, SSWPItems.NETHERITE_CAULDRON);
		Item.BLOCK_ITEMS.put(NETHERITE_POTION_CAULDRON, SSWPItems.NETHERITE_CAULDRON);
		Item.BLOCK_ITEMS.put(NETHERITE_MILK_CAULDRON, SSWPItems.NETHERITE_CAULDRON);
		Item.BLOCK_ITEMS.put(NETHERITE_HONEY_CAULDRON, SSWPItems.NETHERITE_CAULDRON);
		Item.BLOCK_ITEMS.put(NETHERITE_SLIME_CAULDRON, SSWPItems.NETHERITE_CAULDRON);
		Item.BLOCK_ITEMS.put(COPPER_DYED_WATER_CAULDRON, SSWPItems.COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(COPPER_POTION_CAULDRON, SSWPItems.COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(COPPER_MILK_CAULDRON, SSWPItems.COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(COPPER_HONEY_CAULDRON, SSWPItems.COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(COPPER_SLIME_CAULDRON, SSWPItems.COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(EXPOSED_COPPER_DYED_WATER_CAULDRON, SSWPItems.EXPOSED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(EXPOSED_COPPER_POTION_CAULDRON, SSWPItems.EXPOSED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(EXPOSED_COPPER_MILK_CAULDRON, SSWPItems.EXPOSED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(EXPOSED_COPPER_HONEY_CAULDRON, SSWPItems.EXPOSED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(EXPOSED_COPPER_SLIME_CAULDRON, SSWPItems.EXPOSED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(WEATHERED_COPPER_DYED_WATER_CAULDRON, SSWPItems.WEATHERED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(WEATHERED_COPPER_POTION_CAULDRON, SSWPItems.WEATHERED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(WEATHERED_COPPER_MILK_CAULDRON, SSWPItems.WEATHERED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(WEATHERED_COPPER_HONEY_CAULDRON, SSWPItems.WEATHERED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(WEATHERED_COPPER_SLIME_CAULDRON, SSWPItems.WEATHERED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(OXIDIZED_COPPER_DYED_WATER_CAULDRON, SSWPItems.OXIDIZED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(OXIDIZED_COPPER_POTION_CAULDRON, SSWPItems.OXIDIZED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(OXIDIZED_COPPER_MILK_CAULDRON, SSWPItems.OXIDIZED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(OXIDIZED_COPPER_HONEY_CAULDRON, SSWPItems.OXIDIZED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(OXIDIZED_COPPER_SLIME_CAULDRON, SSWPItems.OXIDIZED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(WAXED_COPPER_POTION_CAULDRON, SSWPItems.WAXED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(WAXED_COPPER_MILK_CAULDRON, SSWPItems.WAXED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(WAXED_COPPER_HONEY_CAULDRON, SSWPItems.WAXED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(WAXED_COPPER_SLIME_CAULDRON, SSWPItems.WAXED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(WAXED_EXPOSED_COPPER_DYED_WATER_CAULDRON, SSWPItems.WAXED_EXPOSED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(WAXED_EXPOSED_COPPER_POTION_CAULDRON, SSWPItems.WAXED_EXPOSED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(WAXED_EXPOSED_COPPER_MILK_CAULDRON, SSWPItems.WAXED_EXPOSED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(WAXED_EXPOSED_COPPER_HONEY_CAULDRON, SSWPItems.WAXED_EXPOSED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(WAXED_EXPOSED_COPPER_SLIME_CAULDRON, SSWPItems.WAXED_EXPOSED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(WAXED_WEATHERED_COPPER_DYED_WATER_CAULDRON, SSWPItems.WAXED_WEATHERED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(WAXED_WEATHERED_COPPER_POTION_CAULDRON, SSWPItems.WAXED_WEATHERED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(WAXED_WEATHERED_COPPER_MILK_CAULDRON, SSWPItems.WAXED_WEATHERED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(WAXED_WEATHERED_COPPER_HONEY_CAULDRON, SSWPItems.WAXED_WEATHERED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(WAXED_WEATHERED_COPPER_SLIME_CAULDRON, SSWPItems.WAXED_WEATHERED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(WAXED_OXIDIZED_COPPER_DYED_WATER_CAULDRON, SSWPItems.WAXED_OXIDIZED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(WAXED_OXIDIZED_COPPER_POTION_CAULDRON, SSWPItems.WAXED_OXIDIZED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(WAXED_OXIDIZED_COPPER_MILK_CAULDRON, SSWPItems.WAXED_OXIDIZED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(WAXED_OXIDIZED_COPPER_HONEY_CAULDRON, SSWPItems.WAXED_OXIDIZED_COPPER_CAULDRON);
		Item.BLOCK_ITEMS.put(WAXED_OXIDIZED_COPPER_SLIME_CAULDRON, SSWPItems.WAXED_OXIDIZED_COPPER_CAULDRON);
		
		OxidizableBlocksRegistry.registerOxidizableBlockPair(COPPER_DYED_WATER_CAULDRON, EXPOSED_COPPER_DYED_WATER_CAULDRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_COPPER_DYED_WATER_CAULDRON, WEATHERED_COPPER_DYED_WATER_CAULDRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_COPPER_DYED_WATER_CAULDRON, OXIDIZED_COPPER_DYED_WATER_CAULDRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(COPPER_POTION_CAULDRON, EXPOSED_COPPER_POTION_CAULDRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_COPPER_POTION_CAULDRON, WEATHERED_COPPER_POTION_CAULDRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_COPPER_POTION_CAULDRON, OXIDIZED_COPPER_POTION_CAULDRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(COPPER_MILK_CAULDRON, EXPOSED_COPPER_MILK_CAULDRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_COPPER_MILK_CAULDRON, WEATHERED_COPPER_MILK_CAULDRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_COPPER_MILK_CAULDRON, OXIDIZED_COPPER_MILK_CAULDRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(COPPER_HONEY_CAULDRON, EXPOSED_COPPER_HONEY_CAULDRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_COPPER_HONEY_CAULDRON, WEATHERED_COPPER_HONEY_CAULDRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_COPPER_HONEY_CAULDRON, OXIDIZED_COPPER_HONEY_CAULDRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(COPPER_SLIME_CAULDRON, EXPOSED_COPPER_SLIME_CAULDRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_COPPER_SLIME_CAULDRON, WEATHERED_COPPER_SLIME_CAULDRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_COPPER_SLIME_CAULDRON, OXIDIZED_COPPER_SLIME_CAULDRON);
		
		OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_DYED_WATER_CAULDRON, WAXED_COPPER_DYED_WATER_CAULDRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_DYED_WATER_CAULDRON, WAXED_EXPOSED_COPPER_DYED_WATER_CAULDRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_DYED_WATER_CAULDRON, WAXED_WEATHERED_COPPER_DYED_WATER_CAULDRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_DYED_WATER_CAULDRON, WAXED_OXIDIZED_COPPER_DYED_WATER_CAULDRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_POTION_CAULDRON, WAXED_COPPER_POTION_CAULDRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_POTION_CAULDRON, WAXED_EXPOSED_COPPER_POTION_CAULDRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_POTION_CAULDRON, WAXED_WEATHERED_COPPER_POTION_CAULDRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_POTION_CAULDRON, WAXED_OXIDIZED_COPPER_POTION_CAULDRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_MILK_CAULDRON, WAXED_COPPER_MILK_CAULDRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_MILK_CAULDRON, WAXED_EXPOSED_COPPER_MILK_CAULDRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_MILK_CAULDRON, WAXED_WEATHERED_COPPER_MILK_CAULDRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_MILK_CAULDRON, WAXED_OXIDIZED_COPPER_MILK_CAULDRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_HONEY_CAULDRON, WAXED_COPPER_HONEY_CAULDRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_HONEY_CAULDRON, WAXED_EXPOSED_COPPER_HONEY_CAULDRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_HONEY_CAULDRON, WAXED_WEATHERED_COPPER_HONEY_CAULDRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_HONEY_CAULDRON, WAXED_OXIDIZED_COPPER_HONEY_CAULDRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_SLIME_CAULDRON, WAXED_COPPER_SLIME_CAULDRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_SLIME_CAULDRON, WAXED_EXPOSED_COPPER_SLIME_CAULDRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_SLIME_CAULDRON, WAXED_WEATHERED_COPPER_SLIME_CAULDRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_SLIME_CAULDRON, WAXED_OXIDIZED_COPPER_SLIME_CAULDRON);
	}
}