package cc.unilock.ae2mixin.mixin.client;

import appeng.client.gui.me.items.PatternEncodingTermScreen;
import org.spongepowered.asm.mixin.Mixin;
import yalter.mousetweaks.api.MouseTweaksDisableWheelTweak;

@MouseTweaksDisableWheelTweak
@Mixin(PatternEncodingTermScreen.class)
public class PatternEncodingTermScreenMixin {
	// NO-OP
}
