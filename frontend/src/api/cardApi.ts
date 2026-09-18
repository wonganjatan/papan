import axios from "axios";

const api = axios.create({
    baseURL: import.meta.env.VITE_SPRING_URL || "http://localhost:8080/api"
})

export const cardApi = {
    getAll: async () => {
        const res = await api.get("/cards")
        return res.data
    }
}