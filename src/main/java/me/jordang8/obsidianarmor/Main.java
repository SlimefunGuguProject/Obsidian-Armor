package me.jordang8.obsidianarmor;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.config.Config;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;

public class Main extends JavaPlugin implements SlimefunAddon {
// testing
    @Override
    public void onEnable() {
        ItemStack categoryItem = new CustomItem(Material.OBSIDIAN, "&8黑曜石合金装甲", "", "&a> 单击打开");

        NamespacedKey categoryId = new NamespacedKey(this, "OBSIDIAN_ARMOR");
        Category category = new Category(categoryId, categoryItem);
        
        
        SlimefunItemStack obs_alloy = new SlimefunItemStack("OBSIDIAN_ALLOY", Material.DIAMOND, "&8黑曜石合金", "&7用于制作黑曜石合金装备");
        ItemStack[] recipe = {  new ItemStack(Material.DIAMOND), new ItemStack(Material.DIAMOND),	new ItemStack(Material.DIAMOND),
        						new ItemStack(Material.DIAMOND), new ItemStack(Material.OBSIDIAN), 	new ItemStack(Material.DIAMOND),
        						new ItemStack(Material.DIAMOND), new ItemStack(Material.DIAMOND), 	new ItemStack(Material.DIAMOND) };
        SlimefunItem item = new SlimefunItem(category, obs_alloy, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
        item.register(this);
        
        SlimefunItemStack obsHelmet = new SlimefunItemStack("OBSIDIAN_HELMET", Material.DIAMOND_HELMET, "&8黑曜石头盔", "&7用坚硬的黑曜石合金制成的头盔" );
        ItemStack[] recipeForHelmet = {			obs_alloy, obs_alloy, obs_alloy,
        											obs_alloy, 	null, 	  obs_alloy,
        											null, 		null, 		null };
		SlimefunItem obs_helmet = new SlimefunItem(category, obsHelmet, RecipeType.ENHANCED_CRAFTING_TABLE, recipeForHelmet);
        final ItemStack isHelmet = obsHelmet;
        
        isHelmet.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
        isHelmet.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 6);
        isHelmet.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 6);
        isHelmet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
       
        obs_helmet.register(this);

        SlimefunItemStack obsChestplate = new SlimefunItemStack("OBSIDIAN_CHESTPLATE", Material.DIAMOND_CHESTPLATE, "&8黑曜石合金胸甲", "&7用坚硬的黑曜石合金制成的胸甲" );
        ItemStack[] recipeForChestplate = {		obs_alloy, 		null, obs_alloy,
        										obs_alloy, obs_alloy, obs_alloy,
        										obs_alloy, obs_alloy, obs_alloy };
		SlimefunItem obs_chestplate = new SlimefunItem(category, obsChestplate, RecipeType.ENHANCED_CRAFTING_TABLE, recipeForChestplate);
        final ItemStack is = obsChestplate;
        
        is.addEnchantment(Enchantment.DURABILITY, 3);
        is.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 6);
        is.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 6);
        is.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
       
        obs_chestplate.register(this);
        
        
        
        SlimefunItemStack obsLeggings = new SlimefunItemStack("OBSIDIAN_LEGGINGS", Material.DIAMOND_LEGGINGS, "&8黑曜石合金护腿", "&7用坚硬的黑曜石合金制成的护腿" );
        ItemStack[] recipeForLeggings = {		obs_alloy, obs_alloy, obs_alloy,
        										obs_alloy, 		null, obs_alloy,
        										obs_alloy, 		null, obs_alloy };
		SlimefunItem obs_leggings = new SlimefunItem(category, obsLeggings, RecipeType.ENHANCED_CRAFTING_TABLE, recipeForLeggings);
        final ItemStack isLeggings = obsLeggings;
        
        isLeggings.addEnchantment(Enchantment.DURABILITY, 3);
        isLeggings.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 6);
        isLeggings.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 6);
        isLeggings.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
       
        obs_leggings.register(this);
        
        
        SlimefunItemStack obsBoots = new SlimefunItemStack("OBSIDIAN_BOOTS", Material.DIAMOND_BOOTS, "&8黑曜石合金靴子", "&7用坚硬的黑曜石合金制成的靴子" );
        ItemStack[] recipeForBoots = {				null,		null, 	null, 
        										obs_alloy, 		null, obs_alloy,
        										obs_alloy, 		null, obs_alloy };
		SlimefunItem obs_boots = new SlimefunItem(category, obsBoots, RecipeType.ENHANCED_CRAFTING_TABLE, recipeForBoots);
        final ItemStack isBoots = obsBoots;
        
        isBoots.addEnchantment(Enchantment.DURABILITY, 3);
        isBoots.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 6);
        isBoots.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 6);
        isBoots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
       
        obs_boots.register(this);
    }

    @Override
    public void onDisable() {
    }

    @Override
    public String getBugTrackerURL() {
        return null;
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

}
