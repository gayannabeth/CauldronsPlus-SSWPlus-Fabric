package gay.mountainspring.cauldronsplus_sswplus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import gay.mountainspring.cauldronsplus_sswplus.block.CSSWPBlocks;
import net.fabricmc.api.ModInitializer;

public class CSSWPlus implements ModInitializer {
	public static final String MOD_ID = "cauldronsplus_sswplus";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	
	@Override
	public void onInitialize() {
		CSSWPBlocks.init();
	}
}