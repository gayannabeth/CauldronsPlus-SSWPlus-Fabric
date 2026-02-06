package gay.mountainspring.cauldronsplus_sswplus.datagen;

import gay.mountainspring.aquifer.datagen.AquiferBlockStates;
import gay.mountainspring.aquifer.datagen.AquiferTextureMaps;
import gay.mountainspring.cauldronsplus.block.MilkCauldronBlock;
import gay.mountainspring.cauldronsplus.datagen.CauldronsBlockStates;
import gay.mountainspring.cauldronsplus_sswplus.block.CSSWPBlocks;
import gay.mountainspring.sswplus.block.SSWPBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.ModelIds;
import net.minecraft.data.client.TextureMap;

public class CSSWPBlockStatesModelGen extends FabricModelProvider {
	public CSSWPBlockStatesModelGen(FabricDataOutput output) {
		super(output);
	}
	
	@Override
	public void generateBlockStateModels(BlockStateModelGenerator gen) {
		AquiferBlockStates.registerLeveledCauldron(gen, CSSWPBlocks.GOLD_DYED_WATER_CAULDRON, AquiferTextureMaps.cauldron(SSWPBlocks.GOLD_CAULDRON, Blocks.WATER, "_still"));
		CauldronsBlockStates.registerTwentyFourLeveledCauldron(gen, CSSWPBlocks.GOLD_POTION_CAULDRON, AquiferTextureMaps.cauldron(SSWPBlocks.GOLD_CAULDRON, Blocks.WATER, "_still"));
		CauldronsBlockStates.registerFourLeveledCauldron(gen, CSSWPBlocks.GOLD_MILK_CAULDRON, AquiferTextureMaps.cauldron(TextureMap.getId(SSWPBlocks.GOLD_CAULDRON), MilkCauldronBlock.MILK_TEXTURE_ID));
		CauldronsBlockStates.registerHoneyCauldron(gen, CSSWPBlocks.GOLD_HONEY_CAULDRON, SSWPBlocks.GOLD_CAULDRON);
		CauldronsBlockStates.registerSlimeCauldron(gen, CSSWPBlocks.GOLD_SLIME_CAULDRON, SSWPBlocks.GOLD_CAULDRON);
		
		AquiferBlockStates.registerLeveledCauldron(gen, CSSWPBlocks.NETHERITE_DYED_WATER_CAULDRON, AquiferTextureMaps.cauldron(SSWPBlocks.NETHERITE_CAULDRON, Blocks.WATER, "_still"));
		CauldronsBlockStates.registerTwentyFourLeveledCauldron(gen, CSSWPBlocks.NETHERITE_POTION_CAULDRON, AquiferTextureMaps.cauldron(SSWPBlocks.NETHERITE_CAULDRON, Blocks.WATER, "_still"));
		CauldronsBlockStates.registerFourLeveledCauldron(gen, CSSWPBlocks.NETHERITE_MILK_CAULDRON, AquiferTextureMaps.cauldron(TextureMap.getId(SSWPBlocks.NETHERITE_CAULDRON), MilkCauldronBlock.MILK_TEXTURE_ID));
		CauldronsBlockStates.registerHoneyCauldron(gen, CSSWPBlocks.NETHERITE_HONEY_CAULDRON, SSWPBlocks.NETHERITE_CAULDRON);
		CauldronsBlockStates.registerSlimeCauldron(gen, CSSWPBlocks.NETHERITE_SLIME_CAULDRON, SSWPBlocks.NETHERITE_CAULDRON);
		
		AquiferBlockStates.registerLeveledCauldron(gen, CSSWPBlocks.COPPER_DYED_WATER_CAULDRON, AquiferTextureMaps.cauldron(SSWPBlocks.COPPER_CAULDRON, Blocks.WATER, "_still"));
		CauldronsBlockStates.registerTwentyFourLeveledCauldron(gen, CSSWPBlocks.COPPER_POTION_CAULDRON, AquiferTextureMaps.cauldron(SSWPBlocks.COPPER_CAULDRON, Blocks.WATER, "_still"));
		CauldronsBlockStates.registerFourLeveledCauldron(gen, CSSWPBlocks.COPPER_MILK_CAULDRON, AquiferTextureMaps.cauldron(TextureMap.getId(SSWPBlocks.COPPER_CAULDRON), MilkCauldronBlock.MILK_TEXTURE_ID));
		CauldronsBlockStates.registerHoneyCauldron(gen, CSSWPBlocks.COPPER_HONEY_CAULDRON, SSWPBlocks.COPPER_CAULDRON);
		CauldronsBlockStates.registerSlimeCauldron(gen, CSSWPBlocks.COPPER_SLIME_CAULDRON, SSWPBlocks.COPPER_CAULDRON);
		AquiferBlockStates.registerLeveledCauldron(gen, CSSWPBlocks.EXPOSED_COPPER_DYED_WATER_CAULDRON, AquiferTextureMaps.cauldron(SSWPBlocks.EXPOSED_COPPER_CAULDRON, Blocks.WATER, "_still"));
		CauldronsBlockStates.registerTwentyFourLeveledCauldron(gen, CSSWPBlocks.EXPOSED_COPPER_POTION_CAULDRON, AquiferTextureMaps.cauldron(SSWPBlocks.EXPOSED_COPPER_CAULDRON, Blocks.WATER, "_still"));
		CauldronsBlockStates.registerFourLeveledCauldron(gen, CSSWPBlocks.EXPOSED_COPPER_MILK_CAULDRON, AquiferTextureMaps.cauldron(TextureMap.getId(SSWPBlocks.EXPOSED_COPPER_CAULDRON), MilkCauldronBlock.MILK_TEXTURE_ID));
		CauldronsBlockStates.registerHoneyCauldron(gen, CSSWPBlocks.EXPOSED_COPPER_HONEY_CAULDRON, SSWPBlocks.EXPOSED_COPPER_CAULDRON);
		CauldronsBlockStates.registerSlimeCauldron(gen, CSSWPBlocks.EXPOSED_COPPER_SLIME_CAULDRON, SSWPBlocks.EXPOSED_COPPER_CAULDRON);
		AquiferBlockStates.registerLeveledCauldron(gen, CSSWPBlocks.WEATHERED_COPPER_DYED_WATER_CAULDRON, AquiferTextureMaps.cauldron(SSWPBlocks.WEATHERED_COPPER_CAULDRON, Blocks.WATER, "_still"));
		CauldronsBlockStates.registerTwentyFourLeveledCauldron(gen, CSSWPBlocks.WEATHERED_COPPER_POTION_CAULDRON, AquiferTextureMaps.cauldron(SSWPBlocks.WEATHERED_COPPER_CAULDRON, Blocks.WATER, "_still"));
		CauldronsBlockStates.registerFourLeveledCauldron(gen, CSSWPBlocks.WEATHERED_COPPER_MILK_CAULDRON, AquiferTextureMaps.cauldron(TextureMap.getId(SSWPBlocks.WEATHERED_COPPER_CAULDRON), MilkCauldronBlock.MILK_TEXTURE_ID));
		CauldronsBlockStates.registerHoneyCauldron(gen, CSSWPBlocks.WEATHERED_COPPER_HONEY_CAULDRON, SSWPBlocks.WEATHERED_COPPER_CAULDRON);
		CauldronsBlockStates.registerSlimeCauldron(gen, CSSWPBlocks.WEATHERED_COPPER_SLIME_CAULDRON, SSWPBlocks.WEATHERED_COPPER_CAULDRON);
		AquiferBlockStates.registerLeveledCauldron(gen, CSSWPBlocks.OXIDIZED_COPPER_DYED_WATER_CAULDRON, AquiferTextureMaps.cauldron(SSWPBlocks.OXIDIZED_COPPER_CAULDRON, Blocks.WATER, "_still"));
		CauldronsBlockStates.registerTwentyFourLeveledCauldron(gen, CSSWPBlocks.OXIDIZED_COPPER_POTION_CAULDRON, AquiferTextureMaps.cauldron(SSWPBlocks.OXIDIZED_COPPER_CAULDRON, Blocks.WATER, "_still"));
		CauldronsBlockStates.registerFourLeveledCauldron(gen, CSSWPBlocks.OXIDIZED_COPPER_MILK_CAULDRON, AquiferTextureMaps.cauldron(TextureMap.getId(SSWPBlocks.OXIDIZED_COPPER_CAULDRON), MilkCauldronBlock.MILK_TEXTURE_ID));
		CauldronsBlockStates.registerHoneyCauldron(gen, CSSWPBlocks.OXIDIZED_COPPER_HONEY_CAULDRON, SSWPBlocks.OXIDIZED_COPPER_CAULDRON);
		CauldronsBlockStates.registerSlimeCauldron(gen, CSSWPBlocks.OXIDIZED_COPPER_SLIME_CAULDRON, SSWPBlocks.OXIDIZED_COPPER_CAULDRON);
		registerThreeLeveledParentedCauldron(gen, CSSWPBlocks.COPPER_DYED_WATER_CAULDRON, CSSWPBlocks.WAXED_COPPER_DYED_WATER_CAULDRON);
		registerTwentyFourLeveledParentedCauldron(gen, CSSWPBlocks.COPPER_POTION_CAULDRON, CSSWPBlocks.WAXED_COPPER_POTION_CAULDRON);
		registerFourLeveledParentedCauldron(gen, CSSWPBlocks.COPPER_MILK_CAULDRON, CSSWPBlocks.WAXED_COPPER_MILK_CAULDRON);
		registerFourLeveledParentedCauldron(gen, CSSWPBlocks.COPPER_HONEY_CAULDRON, CSSWPBlocks.WAXED_COPPER_HONEY_CAULDRON);
		registerNineLeveledParentedCauldron(gen, CSSWPBlocks.COPPER_SLIME_CAULDRON, CSSWPBlocks.WAXED_COPPER_SLIME_CAULDRON);
		registerThreeLeveledParentedCauldron(gen, CSSWPBlocks.EXPOSED_COPPER_DYED_WATER_CAULDRON, CSSWPBlocks.WAXED_EXPOSED_COPPER_DYED_WATER_CAULDRON);
		registerTwentyFourLeveledParentedCauldron(gen, CSSWPBlocks.EXPOSED_COPPER_POTION_CAULDRON, CSSWPBlocks.WAXED_EXPOSED_COPPER_POTION_CAULDRON);
		registerFourLeveledParentedCauldron(gen, CSSWPBlocks.EXPOSED_COPPER_MILK_CAULDRON, CSSWPBlocks.WAXED_EXPOSED_COPPER_MILK_CAULDRON);
		registerFourLeveledParentedCauldron(gen, CSSWPBlocks.EXPOSED_COPPER_HONEY_CAULDRON, CSSWPBlocks.WAXED_EXPOSED_COPPER_HONEY_CAULDRON);
		registerNineLeveledParentedCauldron(gen, CSSWPBlocks.EXPOSED_COPPER_SLIME_CAULDRON, CSSWPBlocks.WAXED_EXPOSED_COPPER_SLIME_CAULDRON);
		registerThreeLeveledParentedCauldron(gen, CSSWPBlocks.WEATHERED_COPPER_DYED_WATER_CAULDRON, CSSWPBlocks.WAXED_WEATHERED_COPPER_DYED_WATER_CAULDRON);
		registerTwentyFourLeveledParentedCauldron(gen, CSSWPBlocks.WEATHERED_COPPER_POTION_CAULDRON, CSSWPBlocks.WAXED_WEATHERED_COPPER_POTION_CAULDRON);
		registerFourLeveledParentedCauldron(gen, CSSWPBlocks.WEATHERED_COPPER_MILK_CAULDRON, CSSWPBlocks.WAXED_WEATHERED_COPPER_MILK_CAULDRON);
		registerFourLeveledParentedCauldron(gen, CSSWPBlocks.WEATHERED_COPPER_HONEY_CAULDRON, CSSWPBlocks.WAXED_WEATHERED_COPPER_HONEY_CAULDRON);
		registerNineLeveledParentedCauldron(gen, CSSWPBlocks.WEATHERED_COPPER_SLIME_CAULDRON, CSSWPBlocks.WAXED_WEATHERED_COPPER_SLIME_CAULDRON);
		registerThreeLeveledParentedCauldron(gen, CSSWPBlocks.OXIDIZED_COPPER_DYED_WATER_CAULDRON, CSSWPBlocks.WAXED_OXIDIZED_COPPER_DYED_WATER_CAULDRON);
		registerTwentyFourLeveledParentedCauldron(gen, CSSWPBlocks.OXIDIZED_COPPER_POTION_CAULDRON, CSSWPBlocks.WAXED_OXIDIZED_COPPER_POTION_CAULDRON);
		registerFourLeveledParentedCauldron(gen, CSSWPBlocks.OXIDIZED_COPPER_MILK_CAULDRON, CSSWPBlocks.WAXED_OXIDIZED_COPPER_MILK_CAULDRON);
		registerFourLeveledParentedCauldron(gen, CSSWPBlocks.OXIDIZED_COPPER_HONEY_CAULDRON, CSSWPBlocks.WAXED_OXIDIZED_COPPER_HONEY_CAULDRON);
		registerNineLeveledParentedCauldron(gen, CSSWPBlocks.OXIDIZED_COPPER_SLIME_CAULDRON, CSSWPBlocks.WAXED_OXIDIZED_COPPER_SLIME_CAULDRON);
	}
	
	public static void registerThreeLeveledParentedCauldron(BlockStateModelGenerator gen, Block modelSource, Block child) {
		gen.blockStateCollector.accept(AquiferBlockStates.createLeveledCauldronBlockState(child,
				ModelIds.getBlockSubModelId(modelSource, "_level1"),
				ModelIds.getBlockSubModelId(modelSource, "_level1"),
				ModelIds.getBlockModelId(modelSource)));
	}
	
	public static void registerFourLeveledParentedCauldron(BlockStateModelGenerator gen, Block modelSource, Block child) {
		gen.blockStateCollector.accept(CauldronsBlockStates.createFourLeveledCauldronBlockState(child,
				ModelIds.getBlockSubModelId(modelSource, "_level1"),
				ModelIds.getBlockSubModelId(modelSource, "_level2"),
				ModelIds.getBlockSubModelId(modelSource, "_level3"),
				ModelIds.getBlockModelId(modelSource)));
	}
	
	public static void registerNineLeveledParentedCauldron(BlockStateModelGenerator gen, Block modelSource, Block child) {
		gen.blockStateCollector.accept(CauldronsBlockStates.createNineLeveledCauldronBlockState(child,
				ModelIds.getBlockSubModelId(modelSource, "_level1"),
				ModelIds.getBlockSubModelId(modelSource, "_level2"),
				ModelIds.getBlockSubModelId(modelSource, "_level3"),
				ModelIds.getBlockSubModelId(modelSource, "_level4"),
				ModelIds.getBlockSubModelId(modelSource, "_level5"),
				ModelIds.getBlockSubModelId(modelSource, "_level6"),
				ModelIds.getBlockSubModelId(modelSource, "_level7"),
				ModelIds.getBlockSubModelId(modelSource, "_level8"),
				ModelIds.getBlockModelId(modelSource)));
	}
	
	public static void registerTwentyFourLeveledParentedCauldron(BlockStateModelGenerator gen, Block modelSource, Block child) {
		gen.blockStateCollector.accept(CauldronsBlockStates.createTwentyFourLeveledCauldronBlockState(child,
				ModelIds.getBlockSubModelId(modelSource, "_level1"),
				ModelIds.getBlockSubModelId(modelSource, "_level2"),
				ModelIds.getBlockSubModelId(modelSource, "_level3"),
				ModelIds.getBlockSubModelId(modelSource, "_level4"),
				ModelIds.getBlockSubModelId(modelSource, "_level5"),
				ModelIds.getBlockSubModelId(modelSource, "_level6"),
				ModelIds.getBlockSubModelId(modelSource, "_level7"),
				ModelIds.getBlockSubModelId(modelSource, "_level8"),
				ModelIds.getBlockSubModelId(modelSource, "_level9"),
				ModelIds.getBlockSubModelId(modelSource, "_level10"),
				ModelIds.getBlockSubModelId(modelSource, "_level11"),
				ModelIds.getBlockSubModelId(modelSource, "_level12"),
				ModelIds.getBlockSubModelId(modelSource, "_level13"),
				ModelIds.getBlockSubModelId(modelSource, "_level14"),
				ModelIds.getBlockSubModelId(modelSource, "_level15"),
				ModelIds.getBlockSubModelId(modelSource, "_level16"),
				ModelIds.getBlockSubModelId(modelSource, "_level17"),
				ModelIds.getBlockSubModelId(modelSource, "_level18"),
				ModelIds.getBlockSubModelId(modelSource, "_level19"),
				ModelIds.getBlockSubModelId(modelSource, "_level20"),
				ModelIds.getBlockSubModelId(modelSource, "_level21"),
				ModelIds.getBlockSubModelId(modelSource, "_level22"),
				ModelIds.getBlockSubModelId(modelSource, "_level23"),
				ModelIds.getBlockModelId(modelSource)));
	}
	
	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		
	}
}