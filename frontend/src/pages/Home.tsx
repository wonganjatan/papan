import { useEffect, useState } from "react"
import type { Card } from "../types/Card"
import { cardApi } from "../api/cardApi"

export default function Home() {
    const [cards, setCards] = useState<Card[] | null>(null)

    useEffect(() => {
        const fetchCards = async () => {
            try {
                const res = await cardApi.getAll()
                setCards(res)
            } catch (error) {
                console.error(error)
            }
        }

        fetchCards()
    }, [])

    if (!cards || cards.length == 0) {
        return <p>Cards is empty</p>
    }

    return (
        <main className="min-h-screen bg-neutral-50 dark:bg-neutral-950 text-neutral-900 dark:text-neutral-100">
            <header className="border-b border-neutral-200 dark:border-neutral-800 px-8 py-5">
                <h1 className="text-xl font-semibold tracking-tight">Papan</h1>
            </header>
            <section className="max-w-5xl mx-auto px-8 py-12">
                {cards.map(card => (
                    <div key={card.id}>
                        <p>{card.title}</p>
                    </div>
                ))}
            </section>
        </main>
    )
}