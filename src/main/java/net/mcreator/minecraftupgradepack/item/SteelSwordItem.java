
package net.mcreator.minecraftupgradepack.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.minecraftupgradepack.MinecraftUpgradePackModElements;

@MinecraftUpgradePackModElements.ModElement.Tag
public class SteelSwordItem extends MinecraftUpgradePackModElements.ModElement {
	@ObjectHolder("minecraft_upgrade_pack:steel_sword")
	public static final Item block = null;

	public SteelSwordItem(MinecraftUpgradePackModElements instance) {
		super(instance, 67);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SteelIngotItem.block));
			}
		}, 3, -2f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("steel_sword"));
	}
}
