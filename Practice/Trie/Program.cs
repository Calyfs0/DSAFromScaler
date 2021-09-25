using System;
using System.Collections.Generic;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            Trie t = new Trie();
            
           
            

            
            while (true) {

                Console.WriteLine("Press 1 to insert, 2 to find, 3 to find prefix. Press any other key to exit.");
                try
                {
                    int input = int.Parse(Console.ReadLine());
                    
                    switch (input)
                    {
                        case 1:
                            {
                                Console.WriteLine("Enter a value to insert?");
                                string value = Console.ReadLine();
                                t.insertString(value);
                                break;
                            }
                        case 2:
                            {
                                Console.WriteLine("Enter a value to search?");
                                string value = Console.ReadLine();
                                bool isFind = t.search(value);
                                Console.WriteLine(isFind ? "String Found" : "String is not present");
                                break;
                            }
                        case 3:
                            {
                                Console.WriteLine("Enter a prefix to search ?");
                                string value = Console.ReadLine();
                                bool isPrefix = t.StartsWith(value);
                                Console.WriteLine(isPrefix ? "Prefix Found" : "Prefix not present");
                                break;
                            }
                        default:
                            {
                                Console.Write("Cya later");
                                Environment.Exit(0);
                                break;
                            }

                    }


                }
                catch (Exception)
                {

                    Console.Write("Cya later");
                    Environment.Exit(0);
                }
            }
            
           
            

        }

    }

    public class Node
    {

        public char c { get; set; }
        public bool isWord { get; set; }
        public Node[] children { get; set; }

        public Node(char ch)
        {
            this.c = ch;
            this.isWord = false;
            this.children = new Node[26];

        }
    }

    public class Trie
    {

        public Node root;

        public Trie()
        {
            root = new Node('\0');
        }

        public void insertString(string word)
        {
            Node current_node = root;

            for (int i = 0; i < word.Length; i++)
            {
                char c = word[i];
                if (current_node.children[c - 'a'] == null)
                {
                    current_node.children[c - 'a'] = new Node(c);
                    current_node = current_node.children[c - 'a'];
                }
                else
                    current_node = current_node.children[c - 'a'];
            }
            current_node.isWord = true;

        }

        public bool search(string word)
        {
            Node node = GetWord(word);
            return (node != null && node.isWord);
            
        }

        public bool StartsWith(string prefix)
        {
            return GetWord(prefix)!=null;
        }
        public Node GetWord(string word)
        {

            Node current_node = root;
            for (int i = 0; i < word.Length; i++)
            {
                char c = word[i];
                if (current_node.children[c - 'a'] == null) return null;
                current_node = current_node.children[c - 'a'];
            }

            return current_node;
        }

        public Node[] findListOfWords(string prefix) {
            Node current_node = root;
            List<Node> wordList = new List<Node>();
            
        }
    }
}
