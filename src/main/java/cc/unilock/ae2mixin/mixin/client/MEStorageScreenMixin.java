package cc.unilock.ae2mixin.mixin.client;

import appeng.client.gui.me.common.MEStorageScreen;
import appeng.client.gui.me.items.CraftingTermScreen;
import appeng.client.gui.me.items.PatternEncodingTermScreen;
import org.spongepowered.asm.mixin.Mixin;
import yalter.mousetweaks.api.MouseTweaksDisableWheelTweak;

@MouseTweaksDisableWheelTweak
@Mixin(value = {CraftingTermScreen.class, MEStorageScreen.class, PatternEncodingTermScreen.class})
public class MEStorageScreenMixin {
	// NO-OP
}
