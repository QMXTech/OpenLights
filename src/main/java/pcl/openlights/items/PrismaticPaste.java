/**
 * 
 */
package pcl.openlights.items;

import net.minecraft.item.Item;

/**
 * @author Caitlyn, Techokami
 *
 */
public class PrismaticPaste extends Item{

	public PrismaticPaste() {
		super();
		maxStackSize = 64;
		setUnlocalizedName("prismaticpaste");
		setRegistryName("prismaticpaste");
		setCreativeTab(li.cil.oc.api.CreativeTab.instance);
	}
}