
package net.mcreator.minecraftupgradepack.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.minecraftupgradepack.MinecraftUpgradePackModElements;

@MinecraftUpgradePackModElements.ModElement.Tag
public class TungstenIngotItem extends MinecraftUpgradePackModElements.ModElement {
	@ObjectHolder("minecraft_upgrade_pack:tungsten_ingot")
	public static final Item block = null;

	public TungstenIngotItem(MinecraftUpgradePackModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("tungsten_ingot");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
