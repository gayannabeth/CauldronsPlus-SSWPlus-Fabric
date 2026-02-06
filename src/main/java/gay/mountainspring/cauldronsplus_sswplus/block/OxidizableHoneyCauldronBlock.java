package gay.mountainspring.cauldronsplus_sswplus.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import gay.mountainspring.aquifer.block.AbstractAquiferCauldronBlock;
import gay.mountainspring.aquifer.block.cauldron.CauldronGroup;
import gay.mountainspring.aquifer.registry.AquiferRegistries;
import gay.mountainspring.cauldronsplus.block.HoneyCauldronBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Degradable;
import net.minecraft.block.Oxidizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class OxidizableHoneyCauldronBlock extends HoneyCauldronBlock implements Oxidizable {
	public static final MapCodec<OxidizableHoneyCauldronBlock> CODEC = RecordCodecBuilder.mapCodec(
			instance -> instance.group(Oxidizable.OxidationLevel.CODEC.fieldOf("weathering_state").forGetter(Degradable::getDegradationLevel),
					AquiferRegistries.CAULDRON_GROUP.getCodec().fieldOf("group").forGetter(AbstractAquiferCauldronBlock::getGroup), createSettingsCodec())
			.apply(instance, OxidizableHoneyCauldronBlock::new));
	
	private final Oxidizable.OxidationLevel oxidationLevel;
	
	@Override
	protected MapCodec<OxidizableHoneyCauldronBlock> getCodec() {
		return CODEC;
	}
	
	public OxidizableHoneyCauldronBlock(Oxidizable.OxidationLevel oxidationLevel, CauldronGroup group, Settings settings) {
		super(group, settings);
		this.oxidationLevel = oxidationLevel;
	}
	
	@Override
	protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		this.tickDegradation(state, world, pos, random);
	}
	
	@Override
	protected boolean hasRandomTicks(BlockState state) {
		return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
	}
	
	@Override
	public OxidationLevel getDegradationLevel() {
		return this.oxidationLevel;
	}
}