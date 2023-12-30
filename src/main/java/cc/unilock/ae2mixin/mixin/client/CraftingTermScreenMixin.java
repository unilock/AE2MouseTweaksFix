package cc.unilock.ae2mixin.mixin.client;

import appeng.client.gui.me.items.CraftingTermScreen;
import org.spongepowered.asm.mixin.Mixin;
import yalter.mousetweaks.api.MouseTweaksDisableWheelTweak;

@MouseTweaksDisableWheelTweak
@Mixin(CraftingTermScreen.class)
public class CraftingTermScreenMixin {
	// NO-OP
}
