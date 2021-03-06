/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Iterator;

/**
 * @author Andy
 *
 * Clasa este echivalentul nodului A.
 */
public class NodeA extends Node
{

    private int ID, iteration;
    private String name;

    List neighbors_list;
    Vector neighbors_vector;
    Set neighbors_set;

    public NodeA()
    {

    }

    public NodeA(String name, int ID, int iteration)
    {
        this.name = name;
        this.ID = ID;
        this.iteration = iteration;
    }

    /**
     * @return
     *
     * Returneaza numele (informatia) nodului.
     */
    @Override
    public String getName()
    {
        return this.name;
    }

    /**
     * @return
     *
     * Returneaza tipul (NodeA, NodeB, NodeC) nodului.
     */
    @Override
    public String getClassType()
    {
        return this.getClass().getSimpleName();
    }

    /**
     * @return
     *
     * Returneaza iteratia (1, 2, 3) nodului.
     */
    @Override
    public int getIteration()
    {
        return this.iteration;
    }

    /**
     * @return 
     * 
     * Returneaza ID-ul nodului.
     */
    @Override
    public int getID()
    {
        return this.ID;
    }

    /**
     * @return 
     * 
     * Returneaza lista de adiacenta a nodului.
     */
    @Override
    public List getNeighborsList()
    {
        return this.neighbors_list;
    }

    /**
     * @return 
     * 
     * Returneaza vectorul de adiacenta a nodului.
     */
    @Override
    public Vector getNeighborsVector()
    {
        return this.neighbors_vector;
    }

    /**
     * @return 
     * 
     * Returneaza setul de adiacenta a nodului.
     */
    @Override
    public Set getNeighborsSet()
    {
        return this.neighbors_set;
    }

    /**
     * @param node
     * 
     * Adauga un "vecin" in lista, vectorul sau setul nodului, in functie de iteratie, daca acesta nu exista deja.
     */
    @Override
    public void addNeighbors(Node node)
    {
        if (iteration == 1)
        {
            if (neighbors_list == null)
            {
                neighbors_list = new List();
            }

            Iterator<Node> it = neighbors_list.list.iterator();

            while (it.hasNext())
            {
                if (it.next().getName().equals(node.getName()))
                {
                    return;
                }
            }

            this.neighbors_list.add(node);

            return;
        }

        if (iteration == 2)
        {
            if (neighbors_vector == null)
            {
                neighbors_vector = new Vector();
            }

            Iterator<Node> it = neighbors_vector.array.iterator();

            while (it.hasNext())
            {
                if (it.next().getName().equals(node.getName()))
                {
                    return;
                }
            }

            this.neighbors_vector.add(node);

            return;
        }

        if (iteration == 3)
        {
            if (neighbors_set == null)
            {
                neighbors_set = new Set();
            }

            Iterator<Node> it = neighbors_set.set.iterator();

            while (it.hasNext())
            {
                if (it.next().getName().equals(node.getName()))
                {
                    return;
                }
            }

            this.neighbors_set.add(node);
        }
    }

    /**
     * @param name 
     * 
     * Sterge un "vecin din lista de adiacenta a nodului, in functie de iteratie.
     */
    @Override
    public void deleteNeighbors(String name)
    {
        if (iteration == 1)
        {
            neighbors_list.delete(name);

            return;
        }

        if (iteration == 2)
        {
            neighbors_vector.delete(name);

            return;
        }

        if (iteration == 3)
        {
            neighbors_set.delete(name);
        }
    }
}
