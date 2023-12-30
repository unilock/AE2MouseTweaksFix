package cc.unilock.ae2mixin.mixin.client;

import appeng.client.gui.me.common.MEStorageScreen;
import org.spongepowered.asm.mixin.Mixin;
import yalter.mousetweaks.api.MouseTweaksDisableWheelTweak;

@MouseTweaksDisableWheelTweak
@Mixin(MEStorageScreen.class)
public class MEStorageScreenMixin {
	// NO-OP
}
