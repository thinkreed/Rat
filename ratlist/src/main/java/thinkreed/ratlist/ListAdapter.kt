package thinkreed.ratlist

/**
 * Created by thinkreed on 2017/10/8.
 */
abstract class ListAdapter :MvpAdapter() {

    private val models by lazy {
        listOf<Model>()
    }

    override fun getItemCount(): Int {
        return models.size
    }

    override fun getItemViewType(position: Int): Int {
        return models[position].viewType
    }
}