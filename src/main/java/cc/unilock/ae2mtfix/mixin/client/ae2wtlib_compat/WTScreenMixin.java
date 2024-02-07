package cc.unilock.ae2mtfix.mixin.client.ae2wtlib_compat;

import de.mari_023.ae2wtlib.wat.WATScreen;
import de.mari_023.ae2wtlib.wct.WCTScreen;
import de.mari_023.ae2wtlib.wet.WETScreen;
import org.spongepowered.asm.mixin.Mixin;
import yalter.mousetweaks.api.MouseTweaksDisableWheelTweak;

@MouseTweaksDisableWheelTweak
@Mixin(value = {WATScreen.class, WCTScreen.class, WETScreen.class})
public class WTScreenMixin {
	// NO-OP
}
