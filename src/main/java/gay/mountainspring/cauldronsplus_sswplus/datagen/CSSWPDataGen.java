package gay.mountainspring.cauldronsplus_sswplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator.Pack;

public class CSSWPDataGen implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator gen) {
		Pack pack = gen.createPack();
		
		pack.addProvider(CSSWPBlockLootGen::new);
		pack.addProvider(CSSWPBlockStatesModelGen::new);
		pack.addProvider(CSSWPBlockTagGen::new);
	}
}
