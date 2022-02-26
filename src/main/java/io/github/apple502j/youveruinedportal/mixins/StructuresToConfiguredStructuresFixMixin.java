package io.github.apple502j.youveruinedportal.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

import net.minecraft.datafixer.fix.StructuresToConfiguredStructuresFix;

@Mixin(StructuresToConfiguredStructuresFix.class)
class StructuresToConfiguredStructuresFixMixin {
	@ModifyConstant(method = "<clinit>", constant = @Constant(stringValue = "minecraft:ruined_portal_standard"))
	private static String fixRuinedPortal(String oldId) {
		return "minecraft:ruined_portal";
	}
}
