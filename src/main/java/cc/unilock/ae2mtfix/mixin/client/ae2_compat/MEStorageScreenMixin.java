package cc.unilock.ae2mtfix.mixin.client.ae2_compat;

import appeng.client.gui.me.common.MEStorageScreen;
import appeng.client.gui.me.items.CraftingTermScreen;
import appeng.client.gui.me.items.PatternEncodingTermScreen;
import appeng.client.gui.me.patternaccess.PatternAccessTermScreen;
import org.spongepowered.asm.mixin.Mixin;
import yalter.mousetweaks.api.MouseTweaksDisableWheelTweak;

@MouseTweaksDisableWheelTweak
@Mixin(value = {CraftingTermScreen.class, MEStorageScreen.class, PatternAccessTermScreen.class, PatternEncodingTermScreen.class})
public class MEStorageScreenMixin {
	// NO-OP
}
